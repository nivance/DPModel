package com.company.visitor.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 在一个单位里谁都是员工，甭管你是部门经理还是小兵
 */
public abstract class Employee {
	public final static int MALE = 0;  //0代表是男性
	public final static int FEMALE = 1; //1代表是女性
	//甭管是谁，都有工资
	private String name;
	
	//只要是员工那就有薪水
	private int salary;
	
	//性别很重要
	private int sex;

	//以下是简单的getter/setter，不多说
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
	//打印出员工的信息
	public final void  report(){
		String info = "姓名：" + this.name + "\t";
		info = info + "性别：" + (this.sex == FEMALE?"女":"男") + "\t";
		info = info + "薪水：" + this.salary  + "\t";
		
		//获得员工的其他信息
		info = info + this.getOtherInfo();
		System.out.println(info);
	}
	
	//拼装员工的其他信息
	protected abstract String getOtherInfo();
	
}
