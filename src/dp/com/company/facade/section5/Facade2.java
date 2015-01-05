package com.company.facade.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Facade2 {
	//引用原有的门面
	private Facade facade = new Facade();
	
	//对外提供唯一的访问子系统的方法
	public void methodB(){
		this.facade.methodB();
	}
}
