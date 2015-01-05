package com.company.builder.section2;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 要什么顺序的车，你说，我给建造出来
 */
public abstract class CarBuilder {
	
	//建造一个模型，你要给我一个顺序要，就是组装顺序
	public abstract void setSequence(ArrayList<String> sequence);
	
	//设置完毕顺序后，就可以直接拿到这个这两模型
	public abstract CarModel getCarModel();
}
