package com.company.pkstructure.decorator_vs_adapter.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UglyDuckling implements Swan {

	//丑小鸭的叫声
	public void cry() {
		System.out.println("叫声是克噜——克噜——克噜");
	}
	
	//丑小鸭的外形
	public void desAppaearance() {
		System.out.println("外形是脏兮兮的白色，毛茸茸的大脑袋");
	}

	//丑小鸭还比较小，不能飞
	public void fly() {
		System.out.println("不能飞行");
	}

}

