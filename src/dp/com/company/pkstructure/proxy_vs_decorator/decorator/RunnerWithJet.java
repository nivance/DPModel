package com.company.pkstructure.proxy_vs_decorator.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class RunnerWithJet implements IRunner {
	private IRunner runner;
	
	public RunnerWithJet(IRunner _runner){
		this.runner = _runner;
	}
	public void run() {
		System.out.println("加快运动员的速度：为运动员增加喷气装置");
		runner.run();
	}

}
