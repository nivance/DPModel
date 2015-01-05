package com.company.chain_of_responsibility.example;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 副总
 */
public class VP extends Handler {

	@Override
	protected int getHandlerLevel() {
		return 3;
	}

	@Override
	protected Response echo(Request request) {
		System.out.println("员工的请求level是：" 
				+ request.getRequestLevel());
		System.out.println("副总的答复是：同意");
		return new Response();
	}

}
