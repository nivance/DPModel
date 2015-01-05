package com.company.interpreter.section1;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 加法运算
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression _left,Expression _right){
		super(_left,_right);
	}
	
	//把左右两个表达式运算的结果加起来
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
