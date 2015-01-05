package com.company.prototype.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 万物
 */
public class Thing implements Cloneable{
	public Thing(){
		System.out.println("构造函数被执行了...");
	}
	
	@Override
	public Thing clone(){
		Thing thing=null;
		try {
			thing = (Thing)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}
}
