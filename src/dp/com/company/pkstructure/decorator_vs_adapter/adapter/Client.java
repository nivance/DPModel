package com.company.pkstructure.decorator_vs_adapter.adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//鸭妈妈有五个孩子，其中四个都是一个模样
		System.out.println("===妈妈有五个孩子，其中四个模样是这样的：===");
		Duck duck = new Duckling();
		duck.cry();  //小鸭子的叫声
		duck.desAppearance(); //小鸭子的外形
		duck.desBehavior(); //小鸭子的其他行为
		System.out.println("\n===一只独特的小鸭子，模样是这样的：===");
		Duck uglyDuckling = new UglyDuckling();
		uglyDuckling.cry(); //丑小鸭的叫声
		uglyDuckling.desAppearance(); //丑小鸭的外形
		uglyDuckling.desBehavior(); //丑小鸭的其他行为
	}
}
