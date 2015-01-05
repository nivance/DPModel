package com.company.pkstructure.proxy_vs_decorator.proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//定义一个短跑运动员
		IRunner liu = new Runner();
		//定义liu的代理人
		IRunner agent = new RunnerAgent(liu);
		//要求运动员跑步
		System.out.println("====客人找到运动员的代理要求其去跑步===");
		agent.run();
	}
}
