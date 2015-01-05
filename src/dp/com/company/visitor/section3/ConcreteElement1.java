package com.company.visitor.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteElement1 extends Element{
	
	//完善业务逻辑
	public void doSomething(){
		//业务处理
	}
	
	//允许那个访问者访问
	public void accept(IVisitor visitor){
		visitor.visit(this);
	}
}
