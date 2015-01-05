package com.company.memento.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class GameNode {
	
	//游戏节点的状态
	private String state = "";
	
	//改变游戏节点的状态
	public void changeState(){
		this.state = "获取开奖号码";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//保留一个备份
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	//恢复一个备份
	public void restoreMemento(Memento _memento){
		this.setState(_memento.getState());
	}
}
