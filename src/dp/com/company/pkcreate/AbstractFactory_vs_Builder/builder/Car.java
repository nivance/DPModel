package com.company.pkcreate.AbstractFactory_vs_Builder.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Car implements ICar {
	//汽车引擎
	private String engine;
	//汽车轮子
	private String wheel;
	
	//一次性传递汽车需要的信息
	public Car(String _engine,String _wheel){
		this.engine = _engine;
		this.wheel = _wheel;
	}
	
	
	public String getEngine() {
		return engine;
	}


	public String getWheel() {
		return wheel;
	}
	
	@Override
	public String toString(){
		return "车的轮子是：" + wheel + "\n车的引擎是：" + engine;		
	}
}