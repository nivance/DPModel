package com.company.template_method.section3;

import com.company.template_method.section3.AbstractClass;
/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		
		//调用模版方法
		class1.templateMethod();
		class2.templateMethod();
	}
}
