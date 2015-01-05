package com.company.srp.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ҵ�������
 */
public class Client {
	
	public static void main(String[] args) {
		IUserInfo userInfo = new UserInfo();
		userInfo.changePassword("abc");
	}
}
