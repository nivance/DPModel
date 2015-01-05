package com.company.lsp.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 业务场景模拟类
 */
public class Client {
	
	public static void main(String[] args) {
		//产生三毛这个狙击手
		Snipper sanMao = new Snipper();
		sanMao.setRifle((AUG)(new Rifle()));		
		sanMao.killEnemy();
	}
}
