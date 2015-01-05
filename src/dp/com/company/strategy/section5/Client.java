package com.company.strategy.section5;

import java.util.Arrays;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	//加符号
	public final static String ADD_SYMBOL = "+";
	//减符号
	public final static String SUB_SYMBOL = "-";
	
	public static void main(String[] args) {
		//输入的两个参数是数字
		int a = Integer.parseInt(args[0]);
		String symbol = args[1];  //符号
		int b = Integer.parseInt(args[2]);
		
		System.out.println("输入的参数为："+Arrays.toString(args));
		//上下文
		Context context = null;
		//判断初始化哪一个策略
		if(symbol.equals(ADD_SYMBOL)){
			context = new Context(new Add());
		}else if(symbol.equals(SUB_SYMBOL)){
			context = new Context(new Sub());
		}
		System.out.println("运行结果为："+a + symbol + b + "=" + context.exec(a, b, symbol));
	}
}
