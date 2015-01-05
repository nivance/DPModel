package com.company.bridge.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 我要关心我自己的公司了
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("-------房地产公司是这个样子运行的-------");
		//先找到我的公司
		HouseCorp houseCorp =new HouseCorp();
		//看我怎么挣钱
		houseCorp.makeMoney();
		System.out.println("\n");
		System.out.println("-------服装公司是这样运行的-------");
		ClothesCorp clothesCorp = new ClothesCorp();
		clothesCorp.makeMoney();
	}
}

