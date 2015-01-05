package com.company.lsp.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 士兵使用枪来杀人
 */
public class Soldier {
	
	public void killEnemy(AbstractGun gun){
		System.out.println("士兵开始杀人...");
		gun.shoot();
	}
}
