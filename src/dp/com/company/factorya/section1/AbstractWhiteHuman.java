package com.company.factorya.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractWhiteHuman implements Human {

	//白色人种的颜色是白色的
	public void getColor(){
		System.out.println("白色人种的皮肤颜色是白色的！");
	}
	
	//白色人种讲话
	public void talk() {
		System.out.println("白色人种会说话，一般都是但是单字节。");

	}

}
