package com.company.visitor.section3;

import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ObjectStruture {

	private com.company.visitor.section3.Element lnkElement;

	//对象生成器，这里通过一个工厂方法模式模拟
	public static Element createElement(){
		Random rand = new Random();
		if(rand.nextInt(100) > 50){
			return new ConcreteElement1();
		}else{
			return new ConcreteElement2();
		}
	}
}
