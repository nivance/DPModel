package com.company.iterator.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	private static Aggregate agg;
	private static Iterator iterator;
	
	public static void main(String[] args) {
		//声明出容器
		agg = new ConcreteAggregate();
		
		//产生对象数据放进去
		agg.add("abc");
		agg.add("aaa");
		agg.add("1234");
		
		//遍历一下
		iterator = agg.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
