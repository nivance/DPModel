package com.company.pkcreate.factory_vs_builder.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ChildSuperManBuilder extends Builder {


	@Override
	public SuperMan getSuperMan() {
		super.setBody("强壮的躯体");
		super.setSpecialTalent("刀枪不入");
		super.setSpecialSymbol("胸前带小S标记");
		return super.superMan;
	}

}
