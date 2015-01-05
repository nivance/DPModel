package com.company.composite.section2;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 这些树枝节点也就是这些领导们既要有自己的信息，还要知道自己的下属情况
 */
@SuppressWarnings("all")
public class Branch implements IBranch, ICorp {
	//领导也是人，也有名字
	private String name = "";
	//领导和领导不同，也是职位区别
	private String position = "";
	//领导也是拿薪水的
	private int salary = 0;
	//领导下边有那些下级领导和小兵
	ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();
	
	//通过构造函数传递领导的信息
	public Branch(String name,String position,int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	//增加一个下属，可能是小头目，也可能是个小兵
	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}

	//我有哪些下属
	public ArrayList<ICorp> getSubordinate() {
		return this.subordinateList;
	}

	//领导也是人，他也有信息
	public String getInfo() {
		String info = "";
		info = "姓名：" + this.name;
		info = info + "\t职位："+ this.position;
		info = info + "\t薪水：" + this.salary;
		return info;
	}

}
