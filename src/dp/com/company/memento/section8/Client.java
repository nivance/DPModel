package com.company.memento.section8;

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
		//创建两个备忘录
		caretaker.setMemento("001",originator.createMemento());
		caretaker.setMemento("002",originator.createMemento());
		//恢复一个指定标记的备忘录
		originator.restoreMemento(caretaker.getMemento("001"));
	}
}
