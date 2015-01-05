package com.company.chain_of_responsibility.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 儿子类
 */
public class Son extends Handler {
	//儿子只处理母亲的请求
	public Son(){
		super(Handler.SON_LEVEL_REQUEST);
	}
	
	//儿子的答复
	protected void response(IWomen women) {
		System.out.println("--------母亲向儿子请示-------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同意\n");
	}

	
}
