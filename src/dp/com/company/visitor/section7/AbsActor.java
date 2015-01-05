package com.company.visitor.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbsActor {
	//演员都能够演一个角色
	public void act(Role role){
		System.out.println("演员可以扮演任何角色");
	}	
	//可以演功夫戏
	public void act(KungFuRole role){
		System.out.println("演员都可以演功夫角色");
	}
}
