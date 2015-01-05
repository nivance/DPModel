package com.company.specification.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class User {
	//姓名
	private String name;
	//年龄
	private int age;
	
	public User(String _name,int _age){
		this.name = _name;
		this.age = _age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//用户的信息打印
	@Override
	public String toString(){
		return "用户名：" + name+"\t年龄：" + age;
	}
}
