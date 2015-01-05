package com.company.composite.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 普通员工很简单，就写一个构造函数就可以了
 */
public class Leaf extends Corp {
	
	//就写一个构造函数，这个是必须的
	public Leaf(String _name,String _position,int _salary){
		super(_name,_position,_salary);
	}
}
