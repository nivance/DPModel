package com.company.proxy.dynamic.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 前置通知
 */
public class BeforeAdvice implements IAdvice{
	
	public void exec(){
		System.out.println("我是前置通知，我被执行了！");
	}
}
