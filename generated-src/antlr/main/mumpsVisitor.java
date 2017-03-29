// Generated from mumps.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mumpsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mumpsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mumpsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(mumpsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(mumpsParser.EofContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(mumpsParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(mumpsParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(mumpsParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#routinedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutinedecl(mumpsParser.RoutinedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(mumpsParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(mumpsParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#subproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproc(mumpsParser.SubprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(mumpsParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#postcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostcondition(mumpsParser.PostconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(mumpsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(mumpsParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(mumpsParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(mumpsParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(mumpsParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#break_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_(mumpsParser.Break_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#do_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_(mumpsParser.Do_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(mumpsParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#halt_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHalt_(mumpsParser.Halt_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#hang_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHang_(mumpsParser.Hang_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(mumpsParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#kill_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_(mumpsParser.Kill_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#merge_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_(mumpsParser.Merge_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#new_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_(mumpsParser.New_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#quit_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit_(mumpsParser.Quit_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#read_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_(mumpsParser.Read_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#set_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_(mumpsParser.Set_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#view_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_(mumpsParser.View_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#write_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_(mumpsParser.Write_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#xecute_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXecute_(mumpsParser.Xecute_Context ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(mumpsParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(mumpsParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link mumpsParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(mumpsParser.ArgContext ctx);
}