package com.company.proxy.dynamic.section2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class MyInvocationHandler implements InvocationHandler {
	//被代理的对象
	private Object target = null;
	//通过构造函数传递一个对象
	public MyInvocationHandler(Object _obj){
		this.target = _obj;
	}
	//代理方法	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//执行被代理的方法
		return method.invoke(this.target, args);
	}
}
