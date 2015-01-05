package com.company.iterator.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 容器类
 */
public interface Aggregate {
	
	//是容器必然有元素的增加
	public void add(Object object);
	
	//减少元素
	public void remove(Object object);
	
	//由迭代器来遍历所有的元素
	public Iterator iterator();
}
