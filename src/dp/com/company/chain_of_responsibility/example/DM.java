package com.company.chain_of_responsibility.example;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 部门经理类
 */
public class DM extends Handler {

	@Override
	protected int getHandlerLevel() {
		return 2;
	}

	@Override
	protected Response echo(Request request) {
		System.out.println("员工的请求level是：" 
				+ request.getRequestLevel());
		System.out.println("部门经理的答复是：同意");
		return new Response();
	}

}
