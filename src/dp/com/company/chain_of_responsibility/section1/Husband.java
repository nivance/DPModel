package com.company.chain_of_responsibility.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 丈夫类
 */
public class Husband implements IHandler {

	//妻子向丈夫请示
	public void HandleMessage(IWomen women) {
		System.out.println("妻子的请示是："+women.getRequest());
		System.out.println("丈夫的答复是：同意");
	}

}
