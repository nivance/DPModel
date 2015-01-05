package com.company.factorys.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	private static Creator creator;
	private static Product product;
	
	public static void main(String[] args) {
		creator = new ConcreteCreator();
		product = creator.createProduct(ConcreteProduct1.class);
		/*
		 * 继续业务处理
		 */
	}
}
