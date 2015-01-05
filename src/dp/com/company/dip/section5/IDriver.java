package com.company.dip.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 司机的接口
 */
public interface IDriver {

	//车辆型号
	public void setCar(ICar car);
	
	//是司机就应该会驾驶汽车
	public void drive();
}
