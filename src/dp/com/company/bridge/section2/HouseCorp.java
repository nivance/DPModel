package com.company.bridge.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 房地产公司，按照翻译来说应该叫realty corp，这个是比较准确的翻译
 * 但是我问你说个房地产公司要你翻译成英文，你第一反映什么？对嘛还是house corp!
 */
public class HouseCorp extends Corp {
	//房地产公司就是盖房子
	protected void produce() {
		System.out.println("房地产公司盖房子...");
	}
	//房地产卖房子，自己住那可不赚钱
	protected void sell() {
		System.out.println("房地产公司出售房子...");
	}
	//房地产公司很High了，赚钱，计算利润
	public void makeMoney(){
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}
}
