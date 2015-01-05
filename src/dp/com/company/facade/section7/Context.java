package com.company.facade.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Context {
	//委托处理
	private ClassA a = new ClassA();
	private ClassC c = new ClassC();
	//复杂的计算
	public void complexMethod(){
		this.a.doSomethingA();
		this.c.doSomethingC();
	}
}
