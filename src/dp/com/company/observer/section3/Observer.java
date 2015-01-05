package com.company.observer.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 所有观察者，通用接口
 */
public interface Observer {
	
	//一发现别人有动静，自己也要行动起来
	public void update(String context);  
}
