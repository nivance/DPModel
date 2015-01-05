package com.company.strategy.section3;

import java.util.Arrays;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//输入的两个参数是数字
		int a = Integer.parseInt(args[0]);
		String symbol = args[1];  //符号
		int b = Integer.parseInt(args[2]);
		System.out.println("输入的参数为："+Arrays.toString(args));
		
		//生成一个运算器
		Calculator cal = new Calculator();
		System.out.println("运行结果为："+a + symbol + b + "=" + cal.exec(a, b, symbol));
		
		
	}
}
