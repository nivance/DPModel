package com.company.visitor.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 负责展示报表的产生
 */
public interface IShowVisitor extends IVisitor {
	//展示报表
	public void report();
}
