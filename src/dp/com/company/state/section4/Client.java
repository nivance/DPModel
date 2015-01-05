package com.company.state.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//定义环境角色
		Context context = new Context();
		//初始化状态
		context.setCurrentState(new ConcreteState1());
		//行为执行
		context.handle1();
		context.handle2();
	}
}
