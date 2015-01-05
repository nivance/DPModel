package com.company.flyweight.section4;

import java.util.HashMap;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SignInfoFactory {
	//池容器
	private static HashMap<String,SignInfo> pool = new HashMap<String,SignInfo>();
	
	//从池中获得对象
	public static SignInfo getSignInfo(String key){
		//设置返回对象
		SignInfo result = null;
		//池中没有该对象，则建立，并放入池中
		if(!pool.containsKey(key)){
			result = new SignInfo();
			pool.put(key, result);
		}else{
			result = pool.get(key);
		}
			
		return result;
	}
}
