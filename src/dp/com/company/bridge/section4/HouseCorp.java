package com.company.bridge.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class HouseCorp extends Corp {
	//定义传递一个House产品进来
	public HouseCorp(House house){
		super(house);
	}
	//房地产公司很High了，赚钱，计算利润
	public void makeMoney(){
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}
}

