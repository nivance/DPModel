package com.company.chain_of_responsibility.example;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Request {
	private int level;
	
	public Request(int level){
		this.level = level;
	}
	
	//请求的等级
	public int getRequestLevel(){
		return level;
	}
}
