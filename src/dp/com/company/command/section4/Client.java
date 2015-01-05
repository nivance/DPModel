package com.company.command.section4;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	private static Invoker invoker;
	private static Command command;
	
	public static void main(String[] args) {
		//首先声明出调用者Invoker
		invoker = new Invoker();
	
		//定义一个发送给接收者的命令
		command = new ConcreteCommand1();
		
		//把命令交给调用者去执行
		invoker.setCommand(command);
		invoker.action();
		
	}

}
