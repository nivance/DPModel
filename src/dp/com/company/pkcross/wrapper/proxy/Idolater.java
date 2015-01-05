package com.company.pkcross.wrapper.proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 受众
 */
public class Idolater {
	
	public static void main(String[] args) {
		//崇拜的明星是谁
		IStar star = new Singer();
		//找到明星的代理人
		IStar agent = new Agent(star);
		System.out.println("追星族：我是你的崇拜者，请签名！");
		//签字
		agent.sign();
	}
}
