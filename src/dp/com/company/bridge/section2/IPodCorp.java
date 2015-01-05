package com.company.bridge.section2;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 我是山寨老大，你流行啥我就生茶啥
 */
public class IPodCorp extends Corp {
	//我开始生产iPod了
	protected void produce() {
		System.out.println("我生产iPod...");
	}
	//山寨的iPod很畅销，便宜呀
	protected void sell() {
		System.out.println("iPod畅销...");
	}
	//狂赚钱
	public void makeMoney(){
		super.makeMoney();
		System.out.println("我赚钱呀...");
	}
}



