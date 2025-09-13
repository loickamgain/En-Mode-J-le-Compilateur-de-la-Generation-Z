// Generated from be/unamur/info/b314/compiler/EMJParser.g4 by ANTLR 4.9.3
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EMJParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EMJParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EMJParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(EMJParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EMJParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(EMJParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(EMJParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#nom_fichier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNom_fichier(EMJParser.Nom_fichierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(EMJParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#element_carte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_carte(EMJParser.Element_carteContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(EMJParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#affectInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectInstr(EMJParser.AffectInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#ifInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInstr(EMJParser.IfInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#elseInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseInstr(EMJParser.ElseInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#loopInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopInstr(EMJParser.LoopInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#preFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreFunc(EMJParser.PreFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(EMJParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#rightExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightExp(EMJParser.RightExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#rightExpB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightExpB(EMJParser.RightExpBContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(EMJParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#leftExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftExp(EMJParser.LeftExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#callFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(EMJParser.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#callFuncArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFuncArgs(EMJParser.CallFuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#callFuncArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFuncArg(EMJParser.CallFuncArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(EMJParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExp(EMJParser.BoolExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(EMJParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(EMJParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#funcParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParams(EMJParser.FuncParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#funcParamsNotEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParamsNotEmpty(EMJParser.FuncParamsNotEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(EMJParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#funcReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncReturn(EMJParser.FuncReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#variableExprEmoji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExprEmoji(EMJParser.VariableExprEmojiContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(EMJParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EMJParser#type_emo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_emo(EMJParser.Type_emoContext ctx);
}