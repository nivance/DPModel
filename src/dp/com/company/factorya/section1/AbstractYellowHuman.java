package com.company.factorya.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractYellowHuman implements Human {
	public void getColor(){
		System.out.println("黄色人种的皮肤颜色是黄色的！");
	}

	public void talk() {
		System.out.println("黄色人种会说话，一般说的都是双字节。");
	}
}
