package com.company.factory_strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 交易信息
 */
public class Trade {
	
	//交易编号
	private String tradeNo = "";

	//交易金额
	private int amount = 0;
	
	//getter/setter方法
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String postNo) {
		this.tradeNo = postNo;
	}

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
