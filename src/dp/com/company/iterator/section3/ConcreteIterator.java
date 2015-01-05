package com.company.iterator.section3;

import java.util.Vector;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteIterator implements Iterator {
	private Vector<Object> vector = new Vector<Object>();
	//定义当前游标
	public int cursor = 0;
	
	public ConcreteIterator(Vector<Object> _vector){		
		this.vector = _vector;
	}
	
	//判断是否到达尾部
	public boolean hasNext() {
		if(this.cursor == this.vector.size()){
			return false;
		}else{
			return true;
		}
	}
	
	//返回下一个元素
	public Object next() {
		Object result = null;
		
		if(this.hasNext()){
			result = this.vector.get(this.cursor++);
		}else{
			result = null;
		}
		return result;
	}

	//删除当前元素
	public boolean remove() {
		this.vector.remove(this.cursor);
		return true;
	}

}
