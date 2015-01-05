package com.company.observer.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 韩非子，李斯的师弟，韩国的重要人物
 */
public class HanFeiZi implements IHanFeiZi{
	//韩非子是否在吃饭，作为监控的判断标准
	private boolean isHavingBreakfast = false;
	//韩非子是否在娱乐
	private boolean isHavingFun = false;
	
	//韩非子要吃饭了
	public void haveBreakfast(){
		System.out.println("韩非子:开始吃饭了...");
		this.isHavingBreakfast =true;
	}
	
	//韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
	public void haveFun(){
		System.out.println("韩非子:开始娱乐了...");
		this.isHavingFun = true;
	}
		
	//以下是bean的基本方法，getter/setter，不多说
	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}

	public void setHavingBreakfast(boolean isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}

	public boolean isHavingFun() {
		return isHavingFun;
	}

	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}
	
}
