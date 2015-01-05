package com.company.specification.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserByAgeThan implements IUserSpecification {
	//基准年龄
	private int age;
	//构造函数传递基准年龄
	public UserByAgeThan(int _age){
		this.age = _age;
	}
	
	//检验用户是否满足条件
	public boolean IsSatisfiedBy(User user) {
		return user.getAge() > age;
	}

}
