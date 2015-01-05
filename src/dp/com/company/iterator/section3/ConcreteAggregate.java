package com.company.iterator.section3;

import java.util.Vector;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteAggregate implements Aggregate {
	//容纳对象的容器
	private Vector<Object> vector = new Vector<Object>();
	
	//增加一个元素
	public void add(Object object) {
		this.vector.add(object);
	}

	//返回迭代器对象
	public Iterator iterator() {
		return new ConcreteIterator(this.vector);
	}

	//删除一个元素
	public void remove(Object object) {
		this.remove(object);
	}

}
