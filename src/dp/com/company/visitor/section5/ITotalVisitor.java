package com.company.visitor.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 负责统计报表的产生
 */
public interface ITotalVisitor extends IVisitor {
	//统计所有员工工资总和
	public void totalSalary();
}
