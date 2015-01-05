package com.company.visitor.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//定义一个演员
		AbsActor actor = new OldActor();
		//定义一个角色
		Role role = new KungFuRole();
		//开始演戏
		role.accept(actor);
	}
}
