// Generated from ./WACCParser.g4 by ANTLR 4.4
package antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WACCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WACCParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WACCParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull WACCParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull WACCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull WACCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#pair_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_literal(@NotNull WACCParser.Pair_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(@NotNull WACCParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(@NotNull WACCParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#bin_op_pr_3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op_pr_3(@NotNull WACCParser.Bin_op_pr_3Context ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#bin_op_pr_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op_pr_4(@NotNull WACCParser.Bin_op_pr_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull WACCParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#bin_op_pr_5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op_pr_5(@NotNull WACCParser.Bin_op_pr_5Context ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#bin_op_pr_6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op_pr_6(@NotNull WACCParser.Bin_op_pr_6Context ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(@NotNull WACCParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#pair_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_elem(@NotNull WACCParser.Pair_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#bin_op_pr_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op_pr_1(@NotNull WACCParser.Bin_op_pr_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#bin_op_pr_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op_pr_2(@NotNull WACCParser.Bin_op_pr_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(@NotNull WACCParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#func_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ident(@NotNull WACCParser.Func_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(@NotNull WACCParser.Base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#pair_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_type(@NotNull WACCParser.Pair_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#assign_lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_lhs(@NotNull WACCParser.Assign_lhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull WACCParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(@NotNull WACCParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(@NotNull WACCParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(@NotNull WACCParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#array_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elem(@NotNull WACCParser.Array_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull WACCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#pair_elem_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_elem_type(@NotNull WACCParser.Pair_elem_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#array_liter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_liter(@NotNull WACCParser.Array_literContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#assign_rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_rhs(@NotNull WACCParser.Assign_rhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#define_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_ident(@NotNull WACCParser.Define_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(@NotNull WACCParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WACCParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(@NotNull WACCParser.Unary_opContext ctx);
}