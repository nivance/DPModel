package com.company.strategy.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Context {
	//抽象策略
	private Strategy strategy = null;
	
	//构造函数设置具体策略
	public Context(Strategy _strategy){
		this.strategy = _strategy;
	}
	
	//封装后的策略方法
	public void doAnythinig(){
		this.strategy.doSomething();
	}
}
