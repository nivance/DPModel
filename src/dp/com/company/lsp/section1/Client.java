package com.company.lsp.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 业务场景模拟类
 */
public class Client {
	
	public static void main(String[] args) {
		//产生三毛这个士兵
		Soldier sanMao = new Soldier();
		//给三毛一支枪
		sanMao.setGun(new Rifle());
		sanMao.killEnemy();
	}
}
