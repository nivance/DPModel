package com.company.adapter.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		
		//现在增加了适配器角色后的业务逻辑
		Target target2 = new Adapter();
		target2.request();
	}
}
