package com.company.srp.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �û������ʵ����
 */
public class UserInfo implements IUserInfo {
	private String userName;
	private String userID;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	//�޸��û�����
	public boolean changePassword(String oldPassword){
		System.out.println("�����޸ĳɹ�...");
		return true;
	}
	
	//ɾ���û�
	public boolean deleteUser(){
		System.out.println("ɾ���û��ɹ�...");
		return true;
	}
	
	//�û�ӳ��
	public void mapUser(){
		System.out.println("�û�ӳ��ɹ�...");
	}
	
	//���һ����֯
	public void addOrg(IUserBO userBO,int orgID){
		System.out.println("�����֯�ɹ�...");
	}
	
	//���һ���ɫ
	public void addRole(IUserBO userBO,int roleID){
		System.out.println("��ӽ�ɫ�ɹ�...");
	}
}
