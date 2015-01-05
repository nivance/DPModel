package com.company.pkcross.wrapper.proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Agent implements IStar {
	//定义是谁的代理人
	private IStar star;
	//构造函数传递明星
	public Agent(IStar _star){
		this.star = _star;
	}
	//代理人是不会签字的，签字了歌迷也不认呀
	public void sign() {
		star.sign();
	}

}
