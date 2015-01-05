package com.company.decorator.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		//第一次修饰
		component = new ConcreteDecorator1(component);
		
		//第二次修饰
		component = new ConcreteDecorator2(component);
		
		//修饰后运行
		component.operate();
		
	}

}
