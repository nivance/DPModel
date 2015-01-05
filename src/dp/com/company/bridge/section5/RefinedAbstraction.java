package com.company.bridge.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class RefinedAbstraction extends Abstraction {
	
	//覆写构造函数
	public RefinedAbstraction(Implementor _imp){
		super(_imp);
	}
	
	//修正父类的行文
	@Override
	public void request(){
		/*
		 * 业务处理....
		 */
		super.request();
		
		super.getImp().doAnything();
	}
}
