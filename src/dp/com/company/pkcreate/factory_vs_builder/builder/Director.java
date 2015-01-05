package com.company.pkcreate.factory_vs_builder.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Director {
	//两个建造者的应用
	private static Builder  adultBuilder = new AdultSuperManBuilder();
	//未成年超人的建造者
	private static Builder childBuilder = new ChildSuperManBuilder();
	
	//建造一个成年、会飞行的超人
	public static SuperMan getAdultSuperMan(){
		return adultBuilder.getSuperMan();
	}
	//建造一个未成年、刀枪不入的超人
	public static SuperMan getChildSuperMan(){
		return childBuilder.getSuperMan();
	}
	
}
