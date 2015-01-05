package com.company.pkcross.wrapper.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class HotAir extends Decorator {
	public HotAir(IStar _star){
		super(_star);
	}
	
	@Override
	public void act(){
		System.out.println("排演前：夸夸其谈，没有自己不能演的角色");
		super.act();
	}
}
