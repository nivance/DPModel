package com.company.proxy.dynamic.section2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DynamicProxy<T> {

	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
		//寻找JoinPoint连接点，AOP框架使用元数据定义
		if(true){
			//执行一个前置通知
			(new BeforeAdvice()).exec();
		}
		//执行目标，并返回结果
		return (T)Proxy.newProxyInstance(loader,interfaces, h);		
	}
}

