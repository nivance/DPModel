package com.company.pkcross.wrapper.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//定义出这个所谓的明星
		IStar freakStar = new FreakStar();
		//看看他是怎么粉饰自己的
		//开演前吹嘘自己无所不能
		freakStar = new HotAir(freakStar);
		//演完毕后，死不承认自己演的烂
		freakStar = new Deny(freakStar);
		//看看他这副嘴脸
		System.out.println("====看看一些虚假明星的嘴脸====");
		freakStar.act();
	}
}
