package com.company.pkbehavior.strategy_vs_state.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Context {
	private WorkAlgorithm workMethod;

	public WorkAlgorithm getWork() {
		return workMethod;
	}

	public void setWork(WorkAlgorithm work) {
		this.workMethod = work;
	}
	
	//每个算法都有必须具有的功能
	public void work(){
		this.workMethod.work();
	}
}
