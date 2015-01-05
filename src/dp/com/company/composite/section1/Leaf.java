package com.company.composite.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 最小的叶子节点
 */
@SuppressWarnings("all")
public class Leaf implements ILeaf {
	//叶子叫什么名字
	private String name = "";
	//叶子的职位
	private String position = "";
	//叶子的薪水
	private int salary=0;
	
	//通过构造函数传递信息
	public Leaf(String name,String position,int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	//最小的小兵只能获得自己的信息了
	public String getInfo() {
		String info = "";
		info = "名称：" + this.name;
		info = info + "\t职位："+ this.position;
		info = info + "\t薪水："+this.salary;
		return info;
	}

}
