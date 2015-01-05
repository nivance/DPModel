package com.company.factorys.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 首先定义女娲，这真是额的神呀
 */
public class NvWa {

	public static void main(String[] args) {
		//声明阴阳八卦炉
		AbstractHumanFactory YinYangLu = new HumanFactory();
		
		//女娲第一次造人，火候不足，缺陷产品
		System.out.println("--造出的第三批人是白色人种--");
		Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		//女娲第二次造人，火候过足，又是次品，
		System.out.println("\n--造出的第三批人是黑色人种--");
		Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		//第三次造人，火候正正好，优品！黄色人种
		System.out.println("\n--造出的第三批人是黄色人种--");
		Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
			
	}

}
