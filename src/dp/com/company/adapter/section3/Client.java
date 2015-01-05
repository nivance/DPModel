package com.company.adapter.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 这就是我们具体的应用了，比如老板要查所有的20-30的女性信息
 */
public class Client {


	public static void main(String[] args) {
	
		//外系统的人员信息
		IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
		//传递三个对象
		IUserInfo youngGirl = new OuterUserInfo(baseInfo,homeInfo,officeInfo); 
		//从数据库中查到101个
		for(int i=0;i<101;i++){
			youngGirl.getMobileNumber();
		}
		
		
	}

}
