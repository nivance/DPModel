package com.company.specification.section1;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IUserProvider {

	//根据用户名查找用户
	public ArrayList<User> findUserByNameEqual(String name);
	
	//年龄大于指定年龄的用户
	public ArrayList<User> findUserByAgeThan(int age);
		
}
