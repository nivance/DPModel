package com.company.interpreter.section1;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 抽象表达式
 */
public abstract class Expression {
	
	//解析公式和数值,其中var中的key值是是公式中的参数，value值是具体的数字
	public abstract int interpreter(HashMap<String,Integer> var);
}
