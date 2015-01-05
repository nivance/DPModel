package com.company.observer_mediator.section2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class EventDispatch implements Observer{
	//单例模式
	private final static EventDispatch dispatch = new EventDispatch(); 
	
	//不允许生成新的实例
	private EventDispatch(){
		
	}
	
	//获得单例对象
	public static EventDispatch getEventDispathc(){
		return dispatch;
	}
	
	//事件触发
	public void update(Observable o, Object arg) {
		
	}
	
}
