package com.company.pkcreate.factory_vs_builder.factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SuperManFactory {
	
	//定义一个生产超人的工厂
	public static ISuperMan createSuperMan(String type){
		//根据输入参数产生不同的超人
		if(type.equalsIgnoreCase("adult")){
			//生产成人超人
			return new AdultSuperMan();
		}else if(type.equalsIgnoreCase("child")){
			//
			return new ChildSuperMan();
		}else{
			return null;
		}
	}
}
