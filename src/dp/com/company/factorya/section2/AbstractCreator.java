package com.company.factorya.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 抽象的产品类
 */
public abstract class AbstractCreator {

	//创建A产品家族
	public abstract AbstractProductA createProductA();
	
	//创建B产品家族
	public abstract AbstractProductB createProductB();
}
