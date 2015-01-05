package com.company.pkcreate.factory_vs_builder.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class AdultSuperManBuilder extends Builder {

	@Override
	public SuperMan getSuperMan() {
		super.setBody("强壮的躯体");
		super.setSpecialTalent("会飞行");
		super.setSpecialSymbol("胸前带S标记");
		return super.superMan;
	}

}
