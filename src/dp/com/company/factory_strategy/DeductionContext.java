package com.company.factory_strategy;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DeductionContext {

	//扣款策略
	private IDeduction deduction = null;
	
	//构造函数传递策略
	public DeductionContext(IDeduction _deduction){
		this.deduction = _deduction;
	}
	
	//执行扣款
	public boolean exec(Card card,Trade trade){
		return this.deduction.exec(card, trade);
	}
}
