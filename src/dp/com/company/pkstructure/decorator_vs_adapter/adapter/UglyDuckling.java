package com.company.pkstructure.decorator_vs_adapter.adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UglyDuckling extends WhiteSwan implements Duck {
	
	//丑小鸭的叫声
	public void cry() {
		super.cry();
	}
	
	//丑小鸭的外形
	public void desAppearance() {
		super.desAppaearance();
	}
	
	//丑小鸭的其他行为
	public void desBehavior(){
		//丑小鸭不仅会游泳
		System.out.println("会游泳");
		//还会飞行
		super.fly();
	}
}
