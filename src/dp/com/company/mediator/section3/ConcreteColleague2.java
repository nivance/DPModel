package com.company.mediator.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 基本上每一个同事类的能从父类继承的方法非常少
 */
public class ConcreteColleague2 extends Colleague {

	//通过构造函数传递中介者
	public ConcreteColleague2(Mediator _mediator){
		super(_mediator);
	}
	
	//自有方法 self-method
	public void selfMethod2(){
		//处理自己的业务逻辑
	}
	
	//依赖方法 dep-method
	public void depMethod2(){
		//处理自己的业务逻辑
		//自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething2();
	}
	
}
