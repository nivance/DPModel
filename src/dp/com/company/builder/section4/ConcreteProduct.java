package com.company.builder.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteProduct extends Builder {
	private Product product = new Product();
	
	//设置产品零件
	public void setPart(){
		/*
		 * 产品类内的逻辑处理
		 */
	}
	
	
	//组建一个产品
	public Product buildProduct() {
		return product;
	}
	
}
