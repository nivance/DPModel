package com.company.pkcreate.AbstractFactory_vs_Builder.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BMWSuv extends AbsBMW {
	private final static String X_SEARIES = "X系列车型SUV";
	
	@Override
	public String getModel() {
		return X_SEARIES;
	}

}