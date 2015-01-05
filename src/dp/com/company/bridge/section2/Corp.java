package com.company.bridge.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Corp {
	
	/*
	 * 是公司就应该有生产把，甭管是什么软件公司还是制造业公司
	 * 那每个公司的生产的东西都不一样，所以由实现类来完成
	 */
	protected abstract void  produce();
	
	/*
	 * 有产品了，那肯定要销售呀，不销售你公司怎么生存
	 */
	protected abstract void sell(); 
	
	//公司是干什么的？赚钱的呀，不赚钱傻子才干
	public void makeMoney(){
		
		//每个公司都是一样，先生产
		this.produce();
		
		//然后销售
		this.sell();
		
	}
	
}
