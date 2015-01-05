package com.company.interpreter.section2;

import java.util.Stack;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 通常该类为一个封装类
 */
@SuppressWarnings("all")
public class Client {
	private static Context ctx;
	private static Stack<Expression> stack;

	public static void main(String[] args) {
		ctx = new Context();
		//通常定一个语法容器，容纳一个具体的表达式，通常为ListArray,LinkedList,Stack等类型
		stack = new Stack<Expression>();
		stack.add(new TerminalExpression());
		/*
		for(;;){
			//进行语法判断，并产生递归调用
		}
		*/
		//产生一个完整的语法树，由各各个具体的语法分析进行解析
		Expression exp = stack.pop();
		
		//具体元素进入场景
		exp.interpreter(ctx);
	}
}
