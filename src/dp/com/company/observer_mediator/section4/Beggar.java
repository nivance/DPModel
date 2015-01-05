package com.company.observer_mediator.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Beggar extends EventCustomer {
	
	//只能处理被人遗弃的东西
	public Beggar(){
		super(EventCustomType.DEL);
	}
	
	@Override
	public void exec(ProductEvent event) {
		//事件的源头
		Product p = event.getSource();
		//事件类型
		ProductEventType type = event.getEventType();
		System.out.println("乞丐处理事件:"+p.getName() +"销毁,事件类型="+type);				
	}

}
