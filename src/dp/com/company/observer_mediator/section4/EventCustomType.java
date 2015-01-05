package com.company.observer_mediator.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public enum EventCustomType {
	//新建立事件
	NEW(1),
	//删除事件
	DEL(2),
	//修改事件
	EDIT(3),
	//克隆事件
	CLONE(4);
	
	private int value=0;
	private EventCustomType(int _value){
		this.value = _value;
	}
	public int getValue(){
		return value;
	}
}