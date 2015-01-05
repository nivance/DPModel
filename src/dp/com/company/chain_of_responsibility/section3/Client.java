package com.company.chain_of_responsibility.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//声明出所有的处理节点
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		//设置链中的阶段顺序,1-->2-->3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		//提交请求，返回结果
		Response response = handler1.handlerMessage(new Request());
		System.out.println(response);
	}

}
