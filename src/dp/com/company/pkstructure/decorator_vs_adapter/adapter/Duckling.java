package com.company.pkstructure.decorator_vs_adapter.adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Duckling implements Duck {

	public void cry() {
		System.out.println("叫声是嘎——嘎——嘎");

	}

	public void desAppearance() {
		System.out.println("外形是黄白相间，嘴长");
	}
	
	//鸭子的其他行为，比如游泳
	public void desBehavior(){
		System.out.println("会游泳");
	}
}
