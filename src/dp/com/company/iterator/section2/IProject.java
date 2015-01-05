package com.company.iterator.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 定义一个接口，所有的项目都是一个接口
 */
public interface IProject {
	
	//增加项目
	public void add(String name,int num,int cost);
	
	//从老板这里看到的就是项目信息
	public String getProjectInfo();	
	
	//获得一个可以被遍历的对象
	public IProjectIterator iterator();
}
