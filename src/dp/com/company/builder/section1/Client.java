package com.company.builder.section1;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 这里是牛叉公司的天下，他要啥我们给啥
 */
public class Client {

	public static void main(String[] args) {
		/*
		 * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
		 * 说要这样一个模型，这样一个顺序，然后我就来制造
		 */
		BenzModel benz = new BenzModel();
		//存放run的顺序
		ArrayList<String> sequence  = new ArrayList<String>();  		
		sequence.add("engine boom");  //客户要求，run的时候时候先发动引擎
		sequence.add("start");  //启动起来
		sequence.add("stop");  //开了一段就停下来		
		//我们把这个顺序赋予奔驰车
		benz.setSequence(sequence);
		benz.run();		
	}
}

