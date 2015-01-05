package com.company.factory_strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class FreeDeduction implements IDeduction {

	//自由扣款
	public boolean exec(Card card, Trade trade) {
		//直接从自由余额中扣除
		card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
		return true;
	}

}
