package com.company.observer.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Merchant1Observer implements Observer {

	private String name;
	
	public Merchant1Observer(String name){
		this.name = name;
	}
	
	//实现更新方法
	public void update() {
		System.out.println(name + "接收到信息，并进行处理！");
	}

}
