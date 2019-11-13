// Generated from com/technik/circuit/Calculate.g4 by ANTLR 4.1
package com.technik.circuit;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculateParser}.
 */
public interface CalculateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculateParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(@NotNull CalculateParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(@NotNull CalculateParser.SignedAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CalculateParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CalculateParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull CalculateParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull CalculateParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(@NotNull CalculateParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(@NotNull CalculateParser.FuncnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull CalculateParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull CalculateParser.FuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(@NotNull CalculateParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(@NotNull CalculateParser.PowExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(@NotNull CalculateParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(@NotNull CalculateParser.EquationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(@NotNull CalculateParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(@NotNull CalculateParser.ScientificContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull CalculateParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull CalculateParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull CalculateParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull CalculateParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(@NotNull CalculateParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(@NotNull CalculateParser.RelopContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculateParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(@NotNull CalculateParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculateParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(@NotNull CalculateParser.MultiplyingExpressionContext ctx);
}