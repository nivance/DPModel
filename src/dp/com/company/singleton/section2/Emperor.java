/**
 * 
 */
package com.company.singleton.section2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 中国的历史上一般都是一个朝代一个皇帝，有两个皇帝的话，必然要PK出一个皇帝出来。
 * 问题出来了：如果真在一个时间，中国出现了两个皇帝怎么办？比如明朝土木堡之变后，
 * 明英宗被俘虏，明景帝即位，但是明景帝当上皇帝后乐疯了，竟然忘记把他老哥明英宗削为太上皇，
 * 也就是在这一个多月的时间内，中国竟然有两个皇帝！
 * 
 */

public class Emperor {
	//定义最多能产生的实例数量
	private static int maxNumOfEmperor = 2;  	
	//每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
	private static ArrayList<String> nameList=new ArrayList<String>(); 
	//定义一个列表，容纳所有的皇帝实例
	private static ArrayList<Emperor> emperorList=new ArrayList<Emperor>();
	//当前皇帝序列号
	private static int countNumOfEmperor =0;  
	
	//产生所有的对象
	static{
		for(int i=0;i<maxNumOfEmperor;i++){  
			emperorList.add(new Emperor("皇"+(i+1)+"帝"));
		}
	}
	
	private Emperor(){
		//世俗和道德约束你，目的就是不让你产生第二个皇帝
	}
	
	//输入皇帝名称，建立一个皇帝对象
	private Emperor(String name){
		nameList.add(name);
	}
	
	//随机获得一个皇帝对象
	public static Emperor getInstance(){
		Random random = new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);  //随机拉出一个皇帝，只要是个精神领袖就成
		return emperorList.get(countNumOfEmperor);		
	}
	
	//获得指定的皇帝
	public static Emperor getInstance(int i){
		return emperorList.get(i);
	}
	
	//皇帝发话了
	public static void say(){
		System.out.println(nameList.get(countNumOfEmperor));		
	}
}
