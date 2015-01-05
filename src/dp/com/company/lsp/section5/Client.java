package com.company.lsp.section5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	public static void invoker(){
		//有父类的地方就有子类
		//Father f= new Father();
		Son f =new Son();
		Map<Object, Object> map = new HashMap<Object, Object>();
		f.doSomething(map);
	}
	
	public static void main(String[] args) {
		invoker();
	}
}
