package com.company.specification.section3;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//首先初始化一批用户
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("苏大",3));
		userList.add(new User("牛二",8));		
		userList.add(new User("张三",10));
		userList.add(new User("李四",15));
		userList.add(new User("王五",18));
		userList.add(new User("赵六",20));
		userList.add(new User("马七",25));
		userList.add(new User("杨八",30));
		userList.add(new User("侯九",35));
		userList.add(new User("布十",40));
		
		//定义一个用户查询类
		IUserProvider userProvider = new UserProvider(userList);
		
		//打印出年龄大于20岁的用户
		System.out.println("===年龄大于20岁的用户===");
		//定义一个规格
		IUserSpecification userSpec = new UserByAgeThan(20);
		for(User u:userProvider.findUser(userSpec)){
			System.out.println(u);
		}
	}
}
