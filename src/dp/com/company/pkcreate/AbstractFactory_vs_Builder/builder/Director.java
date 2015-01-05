package com.company.pkcreate.AbstractFactory_vs_Builder.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Director {
	
	//声明对建造者的引用
	private CarBuilder benzBuilder = new BenzBuilder();
	private CarBuilder bmwBuilder = new BMWBuilder();
	
	//生产奔驰SUV车型	
	public ICar createBenzSuv(){
		//制造出汽车
		return createCar(benzBuilder, "benz的引擎", "benz的轮胎");
	}
	
	//生产出一辆宝马的商务车
	public ICar createBMWVan(){
		return createCar(benzBuilder, "BMW的引擎", "BMW的轮胎");		
	}
	
	//生产出一个混合车型
	public ICar createComplexCar(){		
		return createCar(bmwBuilder, "BMW的引擎", "benz的轮胎");
	}
	
	//生产车辆
	private ICar createCar(CarBuilder _carBuilder,String engine,String wheel){
		//导演怀揣蓝图
		Blueprint bp = new Blueprint();
		bp.setEngine(engine);
		bp.setWheel(wheel);
		
		System.out.println("获得生产蓝图");
		_carBuilder.receiveBlueprint(bp);
		return _carBuilder.buildCar();
	}
	
}