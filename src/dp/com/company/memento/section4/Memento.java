package com.company.memento.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Memento {
	
	//发起人的内部状态
	private String state = "";
	
	//构造函数传递参数
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
