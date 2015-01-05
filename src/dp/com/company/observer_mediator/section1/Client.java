package com.company.observer_mediator.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		Product p = new Product(new ProductManager(),"abc");
		System.out.println(p.getName());
	}
}
