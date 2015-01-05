/**
 * 
 */
package com.company.singleton.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 中国的历史上一般都是一个朝代一个皇帝，有两个皇帝的话，必然要PK出一个皇帝出来
 */
public class Emperor {
	private static final Emperor emperor =new Emperor();  //初始化一个皇帝
	
	private Emperor(){
		//世俗和道德约束你，目的就是不希望产生第二个皇帝
	}
	
	public static Emperor getInstance(){
		return emperor;
	}
	
	//皇帝发话了
	public static void say(){
		System.out.println("我就是皇帝某某某....");		
	}
}
