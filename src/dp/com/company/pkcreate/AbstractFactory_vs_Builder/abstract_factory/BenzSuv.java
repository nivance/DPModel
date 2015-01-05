package com.company.pkcreate.AbstractFactory_vs_Builder.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BenzSuv extends AbsBenz {
	private final static String G_SERIES = "G系列SUV";
	
	@Override
	public String getModel() {
		return G_SERIES;
	}

}
