/**
 * 
 */
package com.company.singleton.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 大臣们悲惨了，一个皇帝都伺候不过来了，现在还来了两个个皇帝
 * TND，不管了，找到个皇帝，磕头，请按就成了！
 */
@SuppressWarnings("all")
public class Minister {

	public static void main(String[] args) {
		//定义5个大臣
		int ministerNum =5; 
		
		for(int i=0;i<ministerNum;i++){
			Emperor emperor = Emperor.getInstance();
			System.out.print("第"+(i+1)+"个大臣参拜的是：");
			emperor.say();
		}		
	}
}
