package com.company.observer.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteObserver implements Observer {

	//实现更新方法
	public void update() {
		System.out.println("接收到信息，并进行处理！");
	}

}
