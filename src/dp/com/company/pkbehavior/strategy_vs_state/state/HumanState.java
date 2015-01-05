package com.company.pkbehavior.strategy_vs_state.state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class HumanState {
	//指向一个具体的人
	protected Human human;
	//设置一个具体的人
	public void setHuman(Human _human){
		this.human = _human;
	}
	
	//不管人是什么状态都要工作
	public abstract void work();
}
