package com.company.dip.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 司机
 */
public class Driver implements IDriver{
	private ICar car;
	
	//构造函数注入
	public Driver(ICar _car){
		this.car = _car;
	}
	
	//司机的主要职责就是驾驶汽车
	public void drive(){
		this.car.run();
	}
}
