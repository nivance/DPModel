package com.company.memento.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//声明出主角
		GameNode winNotice = new GameNode();
		//声明出备忘录的管理者
		Caretaker caretaker = new Caretaker();
		//初始化当前状态
		winNotice.setState("获取开奖公告");
		System.out.println("=====游戏现在的状态======");
		System.out.println(winNotice.getState());
		//需要记录下当前状态呀
		caretaker.setMemento(winNotice.createMemento());
		//发现开奖公告中的开奖号码与已获得的开奖号码不一致，状态改变
		winNotice.changeState();
		System.out.println("\n=====状态改变后的状态======");
		System.out.println(winNotice.getState());
		//状态改变后，恢复原状
		winNotice.restoreMemento(caretaker.getMemento());
		System.out.println("\n=====恢复后的状态======");
		System.out.println(winNotice.getState());
		
	}
}
