package com.company.pkcreate.AbstractFactory_vs_Builder.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BMWVan extends AbsBMW {
	private final static String SEVENT_SEARIES = "7系列车型商务车";
	
	@Override
	public String getModel() {
		return SEVENT_SEARIES;
	}

}
