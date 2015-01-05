package com.company.state.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		//本状态下必须处理的逻辑
	}


	@Override
	public void handle2() {
		//设置当前状态为stat2
		super.context.setCurrentState(Context.STATE2);
		//过渡到state2状态，由Context实现
		super.context.handle2();
	}

}
