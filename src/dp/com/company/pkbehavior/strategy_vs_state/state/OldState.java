package com.company.pkbehavior.strategy_vs_state.state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OldState extends HumanState {

	//老年人的工作就是回忆
	@Override
	public void work() {
		System.out.println("老年人的工作就是回忆以前的生活！");
	}

}
