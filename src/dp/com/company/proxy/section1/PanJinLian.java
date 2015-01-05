package com.company.proxy.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 潘金莲
 */
public class PanJinLian implements KindWomen {
	//羞耻感等级
	private int shameLevel = 10;	
	
	//创建对象的时候，就要定义一个羞耻感，与外界有关系
	public PanJinLian(int level){
		this.shameLevel = this.shameLevel + level;
	}

	
	public void happyWithMan() {
		if(this.shameLevel > 20){
			System.out.println("对不起，我不认识你！");
		}else{
			System.out.println("好的.....");
		}
	}
	
	//增加羞耻感
	public void increaseSharme(int level) {
		this.shameLevel = this.shameLevel + level;
	}

	//抛媚眼
	public void makeEyesWithMan() {
		System.out.println("潘金莲抛媚眼");
	}

}
