package com.company.observer.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//创建一个被观察者
		SltoSaleCeaseSubject subject = new SltoSaleCeaseSubject();
		//定义一个观察者
		Observer obs= new Merchant1Observer("商户10");
		//观察者观察被被观察则
		subject.addObserver(obs);
		//观察者开始活动了
		subject.doSomething();		
	}
	
	


}
