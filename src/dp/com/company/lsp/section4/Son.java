package com.company.lsp.section4;

import java.util.Collection;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 子类
 */
public class Son extends Father {

	//放大输入参数类型
	public Collection<?> doSomething(Map<?, ?> map){
		System.out.println("子类被执行...");
		return map.values();
	}
}
