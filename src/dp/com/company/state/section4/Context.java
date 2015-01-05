package com.company.state.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Context {
	//定义状态
	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();
	
	//当前状态
	private State CurrentState;
	
	//获得当前状态
	public State getCurrentState() {
		return CurrentState;
	}
	
	//设置当前状态
	public void setCurrentState(State currentState) {
		this.CurrentState = currentState;
		//切换状态
		this.CurrentState.setContext(this);
	}
	
	//行为委托
	public void handle1(){
		this.CurrentState.handle1();
	}
	
	public void handle2(){
		this.CurrentState.handle2();
	}
	
	
	
}
