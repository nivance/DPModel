package com.company.proxy.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 场景类
 */
public class Client {

	public static void main(String[] args) {
		//定义一个痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		
		//开始打游戏，记下时间戳
		System.out.println("开始时间是：2009-8-25 10:45");
		player.login("zhangSan", "password");
		//开始杀怪
		player.killBoss();
		//升级
		player.upgrade();
		//记录结束游戏时间
		System.out.println("结束时间是：2009-8-26 03:40");
		
	}

}
