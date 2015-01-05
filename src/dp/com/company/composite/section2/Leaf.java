package com.company.composite.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * Leaf是树叶的也是，在这里就是我们这些小兵
 */
@SuppressWarnings("all")
public class Leaf implements ILeaf {
	//小兵也有名称
	private String name = "";
	//小兵也有职位
	private String position = "";
	//小兵也有薪水，否则谁给你干
	private int salary = 0;
	
	//通过一个构造函数传递小兵的信息
	public Leaf(String name,String position,int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	//获得小兵的信息
	public String getInfo() {
		String info = "";
		info = "姓名：" + this.name;
		info = info + "\t职位："+ this.position;
		info = info + "\t薪水：" + this.salary;
		return info;
	}

}
