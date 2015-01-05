package com.company.pkcreate.factory_vs_builder.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Builder {
	//定义一个超人的应用
	protected final SuperMan superMan = new SuperMan();
	
	//构建出超人的躯体
	public void setBody(String body){
		this.superMan.setBody(body);
	}
	
	//构建出超人的特殊技能
	public void setSpecialTalent(String st){
		this.superMan.setSpecialTalent(st);
	}
	
	//构建出超人的特殊标记
	public void setSpecialSymbol(String ss){
		this.superMan.setSpecialSymbol(ss);
	}
	
	//构建出完整的一个超人
	public abstract SuperMan getSuperMan();
}
