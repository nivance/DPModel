package com.company.proxy.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		Subject realSub = new RealSubject();
		Subject proxy = new Proxy(realSub);
		proxy.request();
	}
}
