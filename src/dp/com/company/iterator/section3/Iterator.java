package com.company.iterator.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface Iterator {
	
	//遍历到下一个元素
	public Object next();
	
	//是否已经遍历到尾部
	public boolean hasNext();
	
	//删除当前指向的元素
	public boolean remove();
}
