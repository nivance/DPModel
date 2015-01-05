package com.company.pkcreate.factory_vs_builder.factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	//模拟生产超人
	public static void main(String[] args) {
		//生产一个成年超人
		ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
		//展示一下超人的技能
		adultSuperMan.specialTalent();
	}
}
