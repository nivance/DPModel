package com.company.proxy.dynamic.section2;

import java.lang.reflect.InvocationHandler;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SubjectDynamicProxy extends DynamicProxy{

	public static <T> T newProxyInstance(Subject subject){
		//获得ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		//获得接口数组
		Class<?>[] classes = subject.getClass().getInterfaces();
		//获得handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classes, handler);
	}
}
