// Generated from com/technik/circuit/Calculate.g4 by ANTLR 4.1
package com.technik.circuit;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculateParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(@NotNull CalculateParser.SignedAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull CalculateParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull CalculateParser.ConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(@NotNull CalculateParser.FuncnameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull CalculateParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(@NotNull CalculateParser.PowExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(@NotNull CalculateParser.EquationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(@NotNull CalculateParser.ScientificContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull CalculateParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull CalculateParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(@NotNull CalculateParser.RelopContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculateParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(@NotNull CalculateParser.MultiplyingExpressionContext ctx);
}