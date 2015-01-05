package com.company.lsp.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 手枪类
 */
public class Handgun extends AbstractGun {
	
	//手枪的特点是携带方便，射程短
	@Override
	public void shoot() {
		System.out.println("手枪射击...");
	}

}
