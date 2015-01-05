package com.company.bridge.section5;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//定义一个实现化角色
		Implementor imp = new ConcreteImplementor1();
		//定义一个抽象化角色
		Abstraction abs = new RefinedAbstraction(imp);
		//执行行文
		abs.request();
	}
}
