package com.company.proxy.dynamic.section2;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//定义一个主题
		Subject subject = new RealSubject();
		//定义主题的代理
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		//代理的行为
		proxy.doSomething("Finish");
	}
}
