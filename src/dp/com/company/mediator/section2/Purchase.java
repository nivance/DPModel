package com.company.mediator.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 采购类
 */
public class Purchase extends AbstractColleague{
	
	public Purchase(AbstractMediator _mediator){
		super(_mediator);
	}
	//采购IBM型号的电脑
	public void buyIBMcomputer(int number){
		super.mediator.execute("purchase.buy", number);
	}
	
	//不在采购IBM电脑
	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑");
	}
}
