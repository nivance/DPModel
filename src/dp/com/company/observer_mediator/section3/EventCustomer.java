package com.company.observer_mediator.section3;

import java.util.Vector;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class EventCustomer {
	//容纳每个消费者能够处理的级别
	private Vector<EventCustomType> customType = new Vector<EventCustomType>();
	
	//每个消费者都要声明自己处理哪一类别的消息
	public EventCustomer(EventCustomType _type){
		addCustomType(_type);
	}
	
	//每个消费者可以消费多个事件
	public void addCustomType(EventCustomType _type){
		customType.add(_type);
	}
	
	//得到自己的处理能力
	public Vector<EventCustomType> getCustomType(){
		return customType;
	}
	
	//每个事件都要对事件进行声明式消费
	public abstract void exec(ProductEvent event);
}
