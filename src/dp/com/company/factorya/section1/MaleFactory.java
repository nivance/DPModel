package com.company.factorya.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 男性工厂
 */
public class MaleFactory implements HumanFactory {
	//生产出黑人男性
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	//生产出白人男性
	public Human createWhiteHuman() {	
		return new MaleWhiteHuman();
	}

	//生产出黄人男性
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

}
