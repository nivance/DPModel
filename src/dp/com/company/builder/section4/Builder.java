package com.company.builder.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Builder {
	
	//设置产品的不同部分，以获得不同的产品
	public abstract void setPart();
	
	
	//建造产品
	public abstract Product buildProduct();
}
