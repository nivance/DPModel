package com.company.template_method.game;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 客户开始使用这个模型
 */
public class Client {

	public static void main(String[] args) {
		GameModel slto = new SltoModel();
		slto.run();
		
		GameModel pck3 = new Pck3Model();
		pck3.run();
	}
}
