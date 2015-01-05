package com.company.pkbehavior.strategy_vs_state.state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ChildState extends HumanState{
	
	//儿童的工作就是玩耍
	public void work(){
		System.out.println("儿童的工作是玩耍！");
		super.human.setState(Human.ADULT_STATE);
	}
}
