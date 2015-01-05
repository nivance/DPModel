package com.company.factorya.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 女性工厂
 */
public class FemaleFactory implements HumanFactory {
	//生产出黑人女性
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	//生产出白人女性
	public Human createWhiteHuman() {	
		return new FemaleWhiteHuman();
	}

	//生产出黄人女性
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

}
