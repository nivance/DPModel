package com.company.pkcreate.AbstractFactory_vs_Builder.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbsBMW implements ICar {
	private final static String BMW_BAND = "宝马汽车";
	
	//宝马车
	public String getBand() {
		return BMW_BAND;
	}
	
	//型号由具体的实现类实现
	public abstract String getModel();

}
