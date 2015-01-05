package com.company.decorator.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteDecorator1 extends Decorator {
	
	//定义被修饰者
	public ConcreteDecorator1(Component _component){
		super(_component);
	}
	
	//定义自己的修饰方法
	private void method1(){
		System.out.println("method1 修饰");
	}
	
	//重写父类的Operation方法
	public void operate(){
		this.method1();
		super.operate();
	}
}
