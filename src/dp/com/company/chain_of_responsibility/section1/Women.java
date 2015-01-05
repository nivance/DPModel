package com.company.chain_of_responsibility.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 古代女性的总称
 */
public class Women implements IWomen{
	/*
	 * 通过一个int类型的参数来描述妇女的个人状况
	 * 1---未出嫁
	 * 2---出嫁
	 * 3---夫死
	 */
	private int type=0;  
	
	//妇女的请示
	private String request = "";
	
	//构造函数传递过来请求
	public Women(int _type,String _request){
		this.type = _type;
		this.request = _request;
	}
	
	//获得自己的状况
	public int getType(){
		return this.type;
	}
	
	//获得妇女的请求
	public String getRequest(){
		return this.request;
	}
}
