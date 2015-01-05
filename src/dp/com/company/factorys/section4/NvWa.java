package com.company.factorys.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 首先定义女娲，这真是额的神呀
 */
public class NvWa {

	public static void main(String[] args) {
		
		//女娲第一次造人，火候不足，缺陷产品
		System.out.println("--造出的第三批人是白色人种--");
		Human whiteHuman = (new WhiteHumanFactory()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		
		//女娲第二次造人，火候过足，又是次品，
		System.out.println("\n--造出的第三批人是黑色人种--");
		Human blackHuman = (new BlackHumanFactory()).createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		
		//第三次造人，火候正正好，优品！黄色人种
		System.out.println("\n--造出的第三批人是黄色人种--");
		Human yellowHuman = (new YellowHumanFactory()).createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
			
	}

}
