// Generated from be/unamur/info/b314/compiler/EMJParser.g4 by ANTLR 4.9.3
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EMJParser}.
 */
public interface EMJParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EMJParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(EMJParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(EMJParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EMJParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EMJParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(EMJParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(EMJParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(EMJParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(EMJParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#nom_fichier}.
	 * @param ctx the parse tree
	 */
	void enterNom_fichier(EMJParser.Nom_fichierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#nom_fichier}.
	 * @param ctx the parse tree
	 */
	void exitNom_fichier(EMJParser.Nom_fichierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(EMJParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(EMJParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#element_carte}.
	 * @param ctx the parse tree
	 */
	void enterElement_carte(EMJParser.Element_carteContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#element_carte}.
	 * @param ctx the parse tree
	 */
	void exitElement_carte(EMJParser.Element_carteContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(EMJParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(EMJParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#affectInstr}.
	 * @param ctx the parse tree
	 */
	void enterAffectInstr(EMJParser.AffectInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#affectInstr}.
	 * @param ctx the parse tree
	 */
	void exitAffectInstr(EMJParser.AffectInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#ifInstr}.
	 * @param ctx the parse tree
	 */
	void enterIfInstr(EMJParser.IfInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#ifInstr}.
	 * @param ctx the parse tree
	 */
	void exitIfInstr(EMJParser.IfInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#elseInstr}.
	 * @param ctx the parse tree
	 */
	void enterElseInstr(EMJParser.ElseInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#elseInstr}.
	 * @param ctx the parse tree
	 */
	void exitElseInstr(EMJParser.ElseInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#loopInstr}.
	 * @param ctx the parse tree
	 */
	void enterLoopInstr(EMJParser.LoopInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#loopInstr}.
	 * @param ctx the parse tree
	 */
	void exitLoopInstr(EMJParser.LoopInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#preFunc}.
	 * @param ctx the parse tree
	 */
	void enterPreFunc(EMJParser.PreFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#preFunc}.
	 * @param ctx the parse tree
	 */
	void exitPreFunc(EMJParser.PreFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(EMJParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(EMJParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#rightExp}.
	 * @param ctx the parse tree
	 */
	void enterRightExp(EMJParser.RightExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#rightExp}.
	 * @param ctx the parse tree
	 */
	void exitRightExp(EMJParser.RightExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#rightExpB}.
	 * @param ctx the parse tree
	 */
	void enterRightExpB(EMJParser.RightExpBContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#rightExpB}.
	 * @param ctx the parse tree
	 */
	void exitRightExpB(EMJParser.RightExpBContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(EMJParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(EMJParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#leftExp}.
	 * @param ctx the parse tree
	 */
	void enterLeftExp(EMJParser.LeftExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#leftExp}.
	 * @param ctx the parse tree
	 */
	void exitLeftExp(EMJParser.LeftExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(EMJParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(EMJParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#callFuncArgs}.
	 * @param ctx the parse tree
	 */
	void enterCallFuncArgs(EMJParser.CallFuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#callFuncArgs}.
	 * @param ctx the parse tree
	 */
	void exitCallFuncArgs(EMJParser.CallFuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#callFuncArg}.
	 * @param ctx the parse tree
	 */
	void enterCallFuncArg(EMJParser.CallFuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#callFuncArg}.
	 * @param ctx the parse tree
	 */
	void exitCallFuncArg(EMJParser.CallFuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(EMJParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(EMJParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(EMJParser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(EMJParser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(EMJParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(EMJParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(EMJParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(EMJParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncParams(EMJParser.FuncParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncParams(EMJParser.FuncParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#funcParamsNotEmpty}.
	 * @param ctx the parse tree
	 */
	void enterFuncParamsNotEmpty(EMJParser.FuncParamsNotEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#funcParamsNotEmpty}.
	 * @param ctx the parse tree
	 */
	void exitFuncParamsNotEmpty(EMJParser.FuncParamsNotEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(EMJParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(EMJParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#funcReturn}.
	 * @param ctx the parse tree
	 */
	void enterFuncReturn(EMJParser.FuncReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#funcReturn}.
	 * @param ctx the parse tree
	 */
	void exitFuncReturn(EMJParser.FuncReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#variableExprEmoji}.
	 * @param ctx the parse tree
	 */
	void enterVariableExprEmoji(EMJParser.VariableExprEmojiContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#variableExprEmoji}.
	 * @param ctx the parse tree
	 */
	void exitVariableExprEmoji(EMJParser.VariableExprEmojiContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EMJParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EMJParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EMJParser#type_emo}.
	 * @param ctx the parse tree
	 */
	void enterType_emo(EMJParser.Type_emoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EMJParser#type_emo}.
	 * @param ctx the parse tree
	 */
	void exitType_emo(EMJParser.Type_emoContext ctx);
}