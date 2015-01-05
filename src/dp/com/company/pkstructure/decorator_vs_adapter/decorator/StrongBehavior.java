package com.company.pkstructure.decorator_vs_adapter.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class StrongBehavior extends Decorator {
	//强化谁
	public StrongBehavior(Swan _swan){
		super(_swan);
	}
	
	//会飞行了
	public void fly(){
		System.out.println("会飞行了！");
	}
}