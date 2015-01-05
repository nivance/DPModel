package com.company.visitor.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Visitor implements IVisitor {

	//访问el1元素
	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
	}

	//访问el2元素
	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}
}
