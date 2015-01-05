package com.company.state.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteState2 extends State {

	@Override
	public void handle1() {		
		//设置当前状态为stat1
		super.context.setCurrentState(Context.STATE1);
		//过渡到state1状态，由Context实现
		super.context.handle1();
	}
	@Override
	public void handle2() {
		//本状态下必须处理的逻辑
	}

}
