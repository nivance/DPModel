package com.company.pkstructure.decorator_vs_adapter.adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class WhiteSwan implements Swan {
	
	//白天鹅的外形的叫声
	public void cry() {
		System.out.println("叫声是克噜——克噜——克噜");
	}
	
	//白天鹅的外形
	public void desAppaearance() {
		System.out.println("外形是纯白色，惹人喜爱");
	}

	//天鹅是能够飞行的
	public void fly() {
		System.out.println("能够飞行");
	}


}
