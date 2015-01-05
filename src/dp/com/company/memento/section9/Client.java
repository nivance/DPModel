package com.company.memento.section9;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//定义出发起人
		Originator originator = new Originator();
		//定义出备忘录管理员
		Caretaker caretaker = new Caretaker();
		//创建一个备忘录
		caretaker.setMemento(originator.createMemento());
		//恢复一个备忘录
		originator.restoreMemento(caretaker.getMemento());
	}
}
