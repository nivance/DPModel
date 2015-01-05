package com.company.visitor.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IVisitor {
	
	//可以访问哪些对象
	public void visit(ConcreteElement1 el1);
	
	public void visit(ConcreteElement2 el2);
}
