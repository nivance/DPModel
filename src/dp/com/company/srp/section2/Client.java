package com.company.srp.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ҵ�������
 */
public class Client {
	
	public static void main(String[] args) {
		IUserBiz userInfo = new UserInfo();
		
		//��Ҫ�����ˣ��Ҿ���Ϊ����һ����BO
		IUserBO userBO = (IUserBO)userInfo;
		userBO.setPassword("abc");
		
		//��Ҫִ�ж����ˣ��Ҿ���Ϊ��һ��ҵ���߼���
		IUserBiz userBiz = (IUserBiz)userInfo;
		userBiz.deleteUser();
				
	}
}
