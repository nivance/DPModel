package com.company.observer.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SltoSaleCeaseSubject extends Subject {
	
	//具体的业务
	public void doSomething(){
		System.out.println("双色球停止销售");
		/*
		 * do something
		 */
		super.notifyObserver();
	}
}
