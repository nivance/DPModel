package com.company.interpreter.section1;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 变量解析器，就是把变量和数值对应起来
 */
public class VarExpression extends Expression {
	private String key;
	
	public VarExpression(String _key){
		this.key = _key;
	}
	
	//从map中取之
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
