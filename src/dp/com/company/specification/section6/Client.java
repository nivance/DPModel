package com.company.specification.section6;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//待分析的对象
		ArrayList<Object> list = new ArrayList<Object>();
		
		//定义两个业务规格
		ISpecification spec1 = new BizSpecification(new Object());
		ISpecification spec2 = new BizSpecification(new Object());
		//规则的调用
		for(Object obj:list){
			if(spec1.and(spec2).isSatisfiedBy(obj)){  //and操作
				System.out.println(obj);
			}
		}
		
	}
}
