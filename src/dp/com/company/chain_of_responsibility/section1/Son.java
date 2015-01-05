package com.company.chain_of_responsibility.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 儿子类
 */
public class Son implements IHandler {

	//目前向儿子请示
	public void HandleMessage(IWomen women) {
		System.out.println("母亲的请示是："+women.getRequest());
		System.out.println("儿子的答复是：同意");
	}

}
