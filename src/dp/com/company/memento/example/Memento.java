package com.company.memento.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Memento {
	
	//游戏节点的状态
	private String state = "";
	
	//通过构造函数传递状态信息
	public Memento(String _state){
		this.state = _state;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
