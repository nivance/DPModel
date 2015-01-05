package com.company.isp.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 场景类
 */
public class Client {
	
	//搜索并展示美女信息
	public static void main(String[] args) {
		//定义一个气质美女
		IGreatTemperamentGirl yanYan = new PettyGirl("嫣嫣");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}

}
