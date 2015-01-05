package com.company.dip.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 司机
 */
public class Driver implements IDriver{
	
	//司机的主要职责就是驾驶汽车
	public void drive(ICar car){
		car.run();
	}
}
