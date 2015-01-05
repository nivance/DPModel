package com.company.lsp.section4;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 父类
 */
@SuppressWarnings("all")
public class Father {
	
	public Collection doSomething(HashMap map){
		System.out.println("父类被执行...");		
		return map.values();
		
	}
}
