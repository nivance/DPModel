package com.company.bridge.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class House extends Product {
	//豆腐渣就豆腐渣呗，好歹也是个房子
	public void beProducted() {
		System.out.println("生产出的房子是这个样子的...");
	}
	//虽然是豆腐渣，也是能够销售出去的
	public void beSelled() {
		System.out.println("生产出的房子卖出去了...");
	}
}

