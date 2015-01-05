package com.company.bridge.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Corp {
	//定义一个产品对象，抽象的了，不知道具体是什么产品
	private Product product;
	//构造函数，由子类定义传递具体的产品进来
	public Corp(Product product){
		this.product = product;
	}
	//公司是干什么的？赚钱的呀，不赚钱傻子才干
	public void makeMoney(){	
		//每个公司都是一样，先生产
		this.product.beProducted();
		//然后销售
		this.product.beSelled();
	}
}

