package com.company.bridge.section3;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		House house = new House();
		System.out.println("-------房地产公司是这个样子运行的-------");
		//先找到房地产公司
		HouseCorp houseCorp =new HouseCorp(house);
		//看我怎么挣钱
		houseCorp.makeMoney();
		System.out.println("\n");	
		//山寨公司生产的产品很多，不过我只要指定产品就成了
		System.out.println("-------山寨公司是这样运行的-------");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();	
	}
}

