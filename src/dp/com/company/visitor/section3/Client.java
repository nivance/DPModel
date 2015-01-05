package com.company.visitor.section3;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			//获得元素对象
			Element el = ObjectStruture.createElement();
			//接受访问者访问
			el.accept(new Visitor());
		}		
	}
}
