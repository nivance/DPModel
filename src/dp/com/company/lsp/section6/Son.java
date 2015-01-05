package com.company.lsp.section6;

import java.util.Collection;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 子类
 */
@SuppressWarnings("all")
public class Son extends Father {

	public Collection doSomething(Map map){
		System.out.println("子类被执行...");		
		return map.values();
	}
	
}
