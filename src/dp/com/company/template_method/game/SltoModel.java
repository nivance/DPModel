package com.company.template_method.game;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */

public class SltoModel extends GameModel {
	@Override
	public void gameInit() {
		System.out.println("双色球初始状态");
	}

	@Override
	public void startSale() {
		System.out.println("双色球开启销售");
	}

	@Override
	public void stopSale() {
		System.out.println("双色球销售截止");
	}

	@Override
	public void startNewPeriod() {
		System.out.println("双色球开启下一期");
	}

	@Override
	public void procPeriodEnd() {
		System.out.println("双色球期终处理流程\n");
	}
}
