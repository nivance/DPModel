package com.company.lsp.section5;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 子类
 */
public class Son extends Father {

	//缩小输入参数范围
	public Collection<?> doSomething(HashMap<?, ?> map){
		System.out.println("子类被执行...");
		return map.values();
	}
}
