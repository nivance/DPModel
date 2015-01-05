package com.company.observer.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteSubject extends Subject {
	
	//具体的业务
	public void doSomething(){
		/*
		 * do something
		 */
		super.notifyObserver();
	}
}
