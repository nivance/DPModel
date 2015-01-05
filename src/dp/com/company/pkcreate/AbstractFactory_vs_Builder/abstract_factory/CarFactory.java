package com.company.pkcreate.AbstractFactory_vs_Builder.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface CarFactory {
	
	//生产SUV
	public ICar createSuv();
	//生产商务车
	public ICar createVan();
}

