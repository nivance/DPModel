/**
 * 
 */
package com.company.strategy.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 计谋有了，那还要有锦囊
 */
public class Context {
	//构造函数，你要使用那个妙计
	private IStrategy straegy;
	public Context(IStrategy strategy){
		this.straegy = strategy;
	}
	
	//使用计谋了，看我出招了
	public void operate(){
		this.straegy.operate();
	}
}
