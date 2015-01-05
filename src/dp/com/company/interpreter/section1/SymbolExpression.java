package com.company.interpreter.section1;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class SymbolExpression extends Expression {
	protected Expression left;
	protected Expression right;
	
	//所有的解析公式都应只关心自己左右两个表达式的结果
	public SymbolExpression(Expression _left,Expression _right){
		this.left = _left;
		this.right = _right;
	}


}
