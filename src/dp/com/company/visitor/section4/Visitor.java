package com.company.visitor.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Visitor implements IVisitor {
	//部门经理的工资系数是5
	private final static int MANAGER_COEFFICIENT = 5;
	
	//员工的工资系数是2
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	
	//普通员工的工资总和
	private int commonTotalSalary = 0;
	
	//部门经理的工资总和
	private int managerTotalSalary =0;
	
	//访问普通员工，打印出报表
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployee(commonEmployee));
		//计算普通员工的薪水总和
		this.calCommonSlary(commonEmployee.getSalary());
	}

	//访问部门经理，打印出报表
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
		//计算部门经理的工资总和
		this.calManagerSalary(manager.getSalary());
	}
	
	//组装出基本信息
	private String getBasicInfo(Employee employee){
		String info = "姓名：" + employee.getName() + "\t";
		info = info + "性别：" + (employee.getSex() == Employee.FEMALE?"女":"男") + "\t";
		info = info + "薪水：" + employee.getSalary()  + "\t";
		
		return info;
	}
	
	//组装出部门经理的信息
	private String getManagerInfo(Manager manager){
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "业绩："+manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}
	
	//组装出普通员工信息
	private String getCommonEmployee(CommonEmployee commonEmployee){
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "工作："+commonEmployee.getJob()+"\t";
		return basicInfo + otherInfo;
	}
	
	
	//计算部门经理的工资总和
	private void calManagerSalary(int salary){
		this.managerTotalSalary = this.managerTotalSalary + salary *MANAGER_COEFFICIENT ;
	}
	
	//计算普通员工的工资总和
	private void calCommonSlary(int salary){
		this.commonTotalSalary = this.commonTotalSalary + salary*COMMONEMPLOYEE_COEFFICIENT;
	}
	
	//获得所有员工的工资总和
	public int getTotalSalary(){
		return this.commonTotalSalary + this.managerTotalSalary;
	}
}
