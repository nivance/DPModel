package com.company.pkcreate.AbstractFactory_vs_Builder.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbsBenz implements ICar {
	private final static String BENZ_BAND = "奔驰汽车";
	
	public String getBand() {
		return BENZ_BAND;
	}

	//具体型号由实现类完成
	public abstract String getModel();

}

