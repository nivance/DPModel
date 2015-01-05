package com.company.pkbehavior.strategy_vs_state.state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class AdultState extends HumanState {

	//成年人的工作就是挣钱
	@Override
	public void work() {
		System.out.println("成年人的工作就是挣钱！");
		super.human.setState(Human.OLD_STATE);
	}

}
