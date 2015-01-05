package com.company.specification.section5;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserProvider implements IUserProvider {
	//用户列表
	private ArrayList<User> userList;
	//传递用户列表
	public UserProvider(ArrayList<User> _userList){
		this.userList = _userList;
	}
	//根据指定的规格查找用户
	public ArrayList<User> findUser(IUserSpecification userSpec) {
		ArrayList<User> result = new ArrayList<User>();
		for(User u:userList){
			if(userSpec.isSatisfiedBy(u)){//符合指定规格
				result.add(u);
			}
		}
		return result;
	}

}
