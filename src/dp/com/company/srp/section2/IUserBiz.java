package com.company.srp.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �û���Ϣ����
 */
public interface IUserBiz {

	//�޸��û�������
	public boolean changePassword(String oldPassword);
	
	//ɾ���û�
	public boolean deleteUser();
	
	//�û�ӳ��
	public void mapUser();
	
	//���һ����֯
	public void addOrg(IUserBO userBO,int orgID);
	
	//���һ���ɫ
	public void addRole(IUserBO userBO,int roleID);
}
