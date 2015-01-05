package com.company.bridge.section1;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 
 */
public class ClothesCorp extends Corp {	
	//服装公司生产的就是衣服了
	protected void produce() {
		System.out.println("服装公司生产衣服...");
	}
	//服装公司卖服装，可只卖服装，不卖穿衣服的模特
	protected void sell() {
		System.out.println("服装公司出售衣服...");
	}
	//服装公司不景气，但怎么说也是赚钱行业
	public void makeMoney(){
		super.makeMoney();
		System.out.println("服装公司赚小钱...");
	}
}


