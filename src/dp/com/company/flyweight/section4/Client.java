package com.company.flyweight.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//在对象池中初始化四个对象
		SignInfoFactory.getSignInfo("科目1");
		SignInfoFactory.getSignInfo("科目2");
		SignInfoFactory.getSignInfo("科目3");
		SignInfoFactory.getSignInfo("科目4");
		
		//取得对象
		SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
		while(true){
			signInfo.setId("ZhangSan");
			signInfo.setLocation("ZhangSan");
			(new MultiThread(signInfo)).start();
			
			signInfo.setId("LiSi");
			signInfo.setLocation("LiSi");
			(new MultiThread(signInfo)).start();
			
		}
	}
	
		
}
