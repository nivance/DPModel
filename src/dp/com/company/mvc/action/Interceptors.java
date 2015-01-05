package com.company.mvc.action;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Interceptors implements Iterable<AbstractInterceptor> {

	//根据拦截器建立一个拦截器链条
	public Interceptors(ArrayList<AbstractInterceptor> list){
		
	}

	
	//列出所有的拦截器
	public Iterator<AbstractInterceptor> iterator() {
		return null;
	}
	
	//拦截器的执行方法
	public void intercept(){
		//委托拦截器执行
	}
}
