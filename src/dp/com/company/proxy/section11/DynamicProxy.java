package com.company.proxy.section11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DynamicProxy<T> {

	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
		T newProxyInstance = (T)Proxy.newProxyInstance(loader,interfaces, h);
		return newProxyInstance;
	}
}
