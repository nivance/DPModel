package com.company.builder.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Director {
	private Builder builder = new ConcreteProduct();
	
	//构建不同的产品
	public Product getAProduct(){
		builder.setPart();  
		/*
		 * 设置不同的零件，产生不同的产品
		 */
		return builder.buildProduct();
	}
}
