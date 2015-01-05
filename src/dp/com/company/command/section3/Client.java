//package com.company.command.section3;
//
//import com.company.command.section4.ConcreteReciver1;
//
//
//
///**
// * @author cbf4Life cbf4life@126.com
// * I'm glad to share my knowledge with you all.
// */
//public class Client {
//	
//	public static void main(String[] args) {
//		//首先声明出调用者Invoker
//		Invoker invoker = new Invoker();
//		
//		//定义接收者
//		Receiver receiver = new ConcreteReciver1();
//		
//		//定义一个发送给接收者的命令
//		Command command = new ConcreteCommand(receiver);
//		
//		//把命令交给调用者去执行
//		invoker.setCommand(command);
//		invoker.action();
//		
//	}
//
//}
