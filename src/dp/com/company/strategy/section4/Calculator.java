package com.company.strategy.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Calculator {
	//加符号
	private final static String ADD_SYMBOL = "+";
	//减符号
	private final static String SUB_SYMBOL = "-";
	
	public int exec(int a,int b,String symbol){
		return symbol.equals(ADD_SYMBOL)?a+b:a-b;
	}
	
}
