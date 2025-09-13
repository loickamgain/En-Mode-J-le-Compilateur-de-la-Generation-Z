package be.unamur.info.b314.compiler.emj;

import be.unamur.info.b314.compiler.EMJParser;
import be.unamur.info.b314.compiler.EMJParserBaseVisitor;
import java.util.List;
import java.util.ArrayList;
import java.text.Normalizer;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.FileWriter;
import java.io.IOException;



public class EMJCodeGenerator extends EMJParserBaseVisitor<String> {

    private final StringBuilder pythonCode;
    private int indentationLevel = 0;
    private String lastMove = "null";

    public EMJCodeGenerator() {
        pythonCode = new StringBuilder();
    }

    public String getPythonCode() {
        return pythonCode.toString();
    }

    private void appendLine(String line) {
        pythonCode.append("    ".repeat(Math.max(0, indentationLevel))).append(line).append("\n");
    }

    private String convertEmojiID(String id) {
        // Retire les crochets pour simplifier
        String emojis = id.replaceAll("[\\[\\]]", "");

        // Crée un StringBuilder pour l'identifiant final
        StringBuilder identifier = new StringBuilder();

        // Parcours chaque codepoint (emoji)
        emojis.codePoints().forEach(codepoint -> {
            String emojiName = Character.getName(codepoint);

            if (emojiName != null) {
                // Nettoie le nom Unicode de l'emoji (retirer les espaces et caractères spéciaux)
                emojiName = emojiName.replaceAll("\\s+", "_").toLowerCase();
                emojiName = Normalizer.normalize(emojiName, Normalizer.Form.NFD);
                emojiName = emojiName.replaceAll("[^\\p{ASCII}]", "");

                identifier.append(emojiName).append("_");
            } else {
                // emoji inconnu, utilise son codepoint Unicode
                identifier.append("emoji").append(codepoint).append("_");
            }
        });

        // Retourne l'identifiant en supprimant le dernier underscore (_)
        return identifier.toString().replaceAll("_$", "");
    }

    @Override
    public String visitProgram(EMJParser.ProgramContext ctx) {
        // Ajouter les imports en haut du fichier généré
        appendLine("from time import sleep");
        appendLine("import music");
        appendLine("");

        if (ctx.imports() != null) {
            visit(ctx.imports());
        }
        visit(ctx.main());


        saveToFile("output.py");
        return null;
    }


    @Override
    public String visitImports(EMJParser.ImportsContext ctx) {
        appendLine("# Import carte : " + ctx.nom_fichier().getText());
        return null;
    }

    @Override
    public String visitMain(EMJParser.MainContext ctx) {
        appendLine("def main():");
        indentationLevel++;

        for (EMJParser.InstructionContext instruction : ctx.instruction()) {
            visit(instruction);
        }
        indentationLevel--;

        appendLine("");
        for (EMJParser.FuncDeclContext funcDecl : ctx.funcDecl()) {
            visit(funcDecl);
        }

        appendLine("");
        appendLine("main()");

        return null;
    }

    @Override
    public String visitInstruction(EMJParser.InstructionContext ctx) {
        if (ctx.affectInstr() != null) {
            visit(ctx.affectInstr());
        } else if (ctx.preFunc() != null) {
            visit(ctx.preFunc());
        } else if (ctx.ifInstr() != null) {
            visit(ctx.ifInstr());
        } else if (ctx.loopInstr() != null) {
            visit(ctx.loopInstr());
        } else if (ctx.variableExprEmoji() != null) {
            visit(ctx.variableExprEmoji());
        } else if (ctx.callFunc() != null) {
            appendLine(visit(ctx.callFunc()));
        }
        return null;
    }

    @Override
    public String visitAffectInstr(EMJParser.AffectInstrContext ctx) {
        String left = visit(ctx.leftExp());
        String right = visit(ctx.rightExp());
        appendLine(left + " = " + right);
        return null;
    }

    @Override
    public String visitVariableExprEmoji(EMJParser.VariableExprEmojiContext ctx) {
        String varName = convertEmojiID(ctx.ID().getText());
        String varValue;

        if (ctx.rightExp() != null) {
            varValue = visitRightExp(ctx.rightExp());
        } else {
            varValue = "None";
        }

        appendLine(varName + " = " + varValue);
        return null;
    }


    @Override
    public String visitPreFunc(EMJParser.PreFuncContext ctx) {
        String distance = "1"; // valeur par défaut
        if (ctx.intExpr() != null) {
            distance = visit(ctx.intExpr());
        }

        if (ctx.HAUTARROW() != null) {
            handleDirection("UP_ARROW", distance);
        } else if (ctx.BASARROW() != null) {
            handleDirection("DOWN_ARROW", distance);
        } else if (ctx.DROITEARROW() != null) {
            handleDirection("RIGHT_ARROW", distance);
        } else if (ctx.GAUCHEARROW() != null) {
            handleDirection("LEFT_ARROW", distance);
        } else if (ctx.ALARME() != null) {
            appendLine("cuteBot.color_light(cuteBot.RGBLights.RGB_R, 0xff0000)");
            appendLine("cuteBot.color_light(cuteBot.RGBLights.RGB_L, 0x00ffff)");
        } else if (ctx.RADIO() != null) {
            appendLine("music.play(music.string_playable('C C B E B B C C', 188), music.PlaybackMode.UNTIL_DONE)");
        } else if (ctx.HANDRAISED() != null) {
            appendLine("cuteBot.motors(30, 30)");
            appendLine("basic.pause(460)");
            appendLine("cuteBot.motors(0, 0)");
            appendLine("basic.pause(500)");
            appendLine("cuteBot.color_light(cuteBot.RGBLights.RGB_R, 0xff0000)");
            appendLine("cuteBot.color_light(cuteBot.RGBLights.RGB_L, 0x00ffff)");
            appendLine("music.play(music.string_playable('C C B E B B C C', 188), music.PlaybackMode.UNTIL_DONE)");
        }

        return null;
    }

    private void handleDirection(String newMove, String distance) {

        if (lastMove.equals("null")) {
            // Première direction : oriente directement vers le bas avec déplacement spécial
            if (newMove.equals("DOWN_ARROW")) {
                moveDownward(distance);
            }else if (newMove.equals("LEFT_ARROW")) {
                turnLeft();
                turnLeft();
                moveForward(distance);
            }else if (newMove.equals("RIGHT_ARROW")) {
                turnRight();
                turnRight();
                moveForward(distance);
            }  else {
                moveForward(distance);  // Par défaut : avancer comme d’habitude
            }
        } else if (!lastMove.equals(newMove)) {
            // Changement de direction : déterminer la rotation

            if ((lastMove.equals("UP_ARROW") && newMove.equals("DOWN_ARROW")) ||
                    (lastMove.equals("DOWN_ARROW") && newMove.equals("UP_ARROW")) ||
                    (lastMove.equals("LEFT_ARROW") && newMove.equals("RIGHT_ARROW")) ||
                    (lastMove.equals("RIGHT_ARROW") && newMove.equals("LEFT_ARROW"))) {
                turnRight();
                turnRight();
                turnRight();
                turnRight();
            } else if ((lastMove.equals("UP_ARROW") && newMove.equals("RIGHT_ARROW")) ||
                    (lastMove.equals("RIGHT_ARROW") && newMove.equals("DOWN_ARROW")) ||
                    (lastMove.equals("DOWN_ARROW") && newMove.equals("LEFT_ARROW")) ||
                    (lastMove.equals("LEFT_ARROW") && newMove.equals("UP_ARROW"))) {
                turnRight();
                turnRight();
            } else {
                turnLeft();
            }

            moveForward(distance);  // avancer après rotation
        } else {
            // Même direction, juste avancer
            moveForward(distance);
        }

        lastMove = newMove;
    }



    private void moveForward(String distance) {
        appendLine("for i in range(" + distance + "):");
        indentationLevel++;
        appendLine("cuteBot.motors(40, 40)");
        appendLine("basic.pause(460)");
        appendLine("cuteBot.motors(0, 0)");
        appendLine("basic.pause(500)");
        indentationLevel--;
    }

    private void moveDownward(String distance) {
        appendLine("for i in range(" + distance + "):");
        indentationLevel++;
        appendLine("cuteBot.motors(-40, -40)");
        appendLine("basic.pause(460)");
        appendLine("cuteBot.motors(0, 0)");
        appendLine("basic.pause(500)");
        indentationLevel--;
    }

    private void turnRight() {
        appendLine("cuteBot.motors(25, -25)");
        appendLine("basic.pause(460)");
        appendLine("cuteBot.motors(0, 0)");
        appendLine("basic.pause(500)");
    }

    private void turnLeft() {
        appendLine("cuteBot.motors(-25, 25)");
        appendLine("basic.pause(460)");
        appendLine("cuteBot.motors(0, 0)");
        appendLine("basic.pause(500)");
    }


    @Override
    public String visitIfInstr(EMJParser.IfInstrContext ctx) {
        appendLine("if " + visit(ctx.boolExp()) + ":");
        indentationLevel++;
        visit(ctx.instructions());
        indentationLevel--;
        if (ctx.ELSE() != null) {
            appendLine("else:");
            indentationLevel++;
            visit(ctx.elseInstr());
            indentationLevel--;
        }
        return null;
    }

    @Override
    public String visitLoopInstr(EMJParser.LoopInstrContext ctx) {
        if (ctx.INFINIE() != null) {
            appendLine("while " + visit(ctx.boolExp()) + ":");
        } else {
            appendLine("for i in range(" + ctx.INTEGER().getText() + "):");
        }
        indentationLevel++;
        ctx.instruction().forEach(this::visit);
        indentationLevel--;
        return null;
    }

    @Override
    public String visitCallFunc(EMJParser.CallFuncContext ctx) {
        String funcName = convertEmojiID(ctx.ID().getText());
        String args = ctx.callFuncArgs() != null ? visit(ctx.callFuncArgs()) : "";
        return funcName + "(" + args + ")";
    }

    @Override
    public String visitCallFuncArgs(EMJParser.CallFuncArgsContext ctx) {
        List<String> args = new ArrayList<>();
        for (EMJParser.CallFuncArgContext arg : ctx.callFuncArg()) {
            args.add(visit(arg));
        }
        return String.join(", ", args);
    }

    @Override
    public String visitIntExpr(EMJParser.IntExprContext ctx) {
        if (ctx.INTEGER() != null)
            return ctx.INTEGER().getText();
        if (ctx.leftExp() != null)
            return visit(ctx.leftExp());
        if (ctx.callFunc() != null)
            return visit(ctx.callFunc());
        if (ctx.op != null && ctx.intExpr().size() == 2)
            return visit(ctx.intExpr(0)) + " " + ctx.op.getText() + " " + visit(ctx.intExpr(1));
        if (ctx.MINUS() != null && ctx.intExpr().size() == 1)
            return "-" + visit(ctx.intExpr(0));
        return "(" + visit(ctx.intExpr(0)) + ")";
    }

    @Override
    public String visitBoolExp(EMJParser.BoolExpContext ctx) {
        if (ctx.bool() != null) {
            return visitBool(ctx.bool());
        } else if (ctx.COMPARATOR() != null && ctx.boolExp().size() == 2) {
            String left = visit(ctx.boolExp(0));
            String right = visit(ctx.boolExp(1));
            return left + " " + ctx.COMPARATOR().getText() + " " + right;
        } else if (ctx.CONNECTOR() != null && ctx.boolExp().size() == 2) {
            String left = visit(ctx.boolExp(0));
            String right = visit(ctx.boolExp(1));
            return left + " " + evaluateConnector(ctx.CONNECTOR().getText()) + " " + right;
        } else if (ctx.NON() != null && ctx.boolExp().size() == 1) {
            return "not " + visit(ctx.boolExp(0));
        } else if (ctx.rightExpB() != null) {
            return visit(ctx.rightExpB());
        } else if (!ctx.boolExp().isEmpty()) {
            return "(" + visit(ctx.boolExp(0)) + ")";
        }

        throw new IllegalArgumentException("boolExp non reconnue : " + ctx.getText());
    }


    private String evaluateConnector(String connector) {
        return connector.equals("🤝") ? "and" : "or";
    }

    @Override
    public String visitBool(EMJParser.BoolContext ctx) {
        return ctx.TRUE() != null ? "True" : "False";
    }

    @Override
    public String visitLeftExp(EMJParser.LeftExpContext ctx) {
        String id = convertEmojiID(ctx.ID().getText());
        if (ctx.ZERO() != null) return id + "[0]";
        if (ctx.UN() != null) return id + "[1]";
        return id;
    }

    @Override
    public String visitTuple(EMJParser.TupleContext ctx) {
        List<String> elements = new ArrayList<>();
        if (!ctx.INTEGER().isEmpty()) {
            for (TerminalNode elem : ctx.INTEGER())
                elements.add(elem.getText());
        } else if (!ctx.STRING().isEmpty()) {
            for (TerminalNode elem : ctx.STRING())
                elements.add("\"" + elem.getText() + "\"");
        } else if (!ctx.CHAR().isEmpty()) {
            for (TerminalNode elem : ctx.CHAR())
                elements.add("'" + elem.getText() + "'");
        } else if (!ctx.bool().isEmpty()) {
            for (EMJParser.BoolContext elem : ctx.bool())
                elements.add(visitBool(elem));
        }
        return "(" + String.join(", ", elements) + ")";
    }

    @Override
    public String visitRightExpB(EMJParser.RightExpBContext ctx) {
        if (ctx.callFunc() != null) {
            return visitCallFunc(ctx.callFunc());
        } else if (ctx.intExpr() != null) {
            return visitIntExpr(ctx.intExpr());
        } else if (ctx.CHAR() != null) {
            return ctx.CHAR().getText();
        } else if (ctx.STRING() != null) {
            return ctx.STRING().getText();
        } else if (ctx.tuple() != null) {
            return visitTuple(ctx.tuple());
        } else if (ctx.leftExp() != null) {
            return visitLeftExp(ctx.leftExp());
        }
        return "null";
    }


    @Override
    public String visitFuncDecl(EMJParser.FuncDeclContext ctx) {
        String funcName = convertEmojiID(ctx.ID().getText());

        List<String> params = new ArrayList<>();
        if (ctx.funcParams() != null && ctx.funcParams().funcParamsNotEmpty() != null) {
            EMJParser.FuncParamsNotEmptyContext paramsCtx = ctx.funcParams().funcParamsNotEmpty();

            // Parcours récursif pour récupérer les paramètres
            while (paramsCtx != null) {
                String paramType = paramsCtx.type().getText();
                String paramName = convertEmojiID(paramsCtx.ID().getText());

                params.add(paramName);

                if (paramsCtx.funcParamsNotEmpty() != null) {
                    paramsCtx = paramsCtx.funcParamsNotEmpty();
                } else {
                    break;
                }
            }
        }

        appendLine("def " + funcName + "(" + String.join(", ", params) + "):");
        indentationLevel++;

        visit(ctx.instructions());

        if (ctx.RETURN() != null) {
            appendLine("return " + visit(ctx.funcReturn()));
        }

        indentationLevel--;
        appendLine("");

        return null;
    }


    // Méthode pour sauvegarder le code Python dans un fichier
    public void saveToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(getPythonCode());
            System.out.println("✅ Fichier Python créé avec succès : " + filePath);
        } catch (IOException e) {
            System.err.println("⚠️ Erreur lors de la création du fichier : " + e.getMessage());
        }
    }


}
