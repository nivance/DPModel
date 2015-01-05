package com.company.chain_of_responsibility.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 古代悲哀女性的总称
 */
public interface IWomen {

	//获得个人状况
	public int getType();
	
	//获得个人请示，你要干什么？出去逛街？约会?还是看电影
	public String getRequest();
}
