package com.company.specification.section1;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserProvider implements IUserProvider {
	//用户列表
	private ArrayList<User> userList;
	
	//构造函数传递用户列表
	public UserProvider(ArrayList<User> _userList){
		this.userList = _userList;
	}
	
	//年龄大于指定年龄的用户
	public ArrayList<User> findUserByAgeThan(int age) {
		ArrayList<User> result = new ArrayList<User>();
		for(User u:userList){
			if(u.getAge()>age){ //符合条件的用户
				result.add(u);
			}
		}
		return result;
	}

	//姓名等于指定姓名的用户
	public ArrayList<User> findUserByNameEqual(String name) {
		ArrayList<User> result = new ArrayList<User>();
		for(User u:userList){
			if(u.getName().equals(name)){//符合条件
				result.add(u);
			}
		}
		return result;
	}

}
