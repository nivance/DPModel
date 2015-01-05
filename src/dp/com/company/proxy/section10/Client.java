package com.company.proxy.section10;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 场景类
 */
public class Client {

	public static void main(String[] args) throws Throwable  {
		//定义一个痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		
		//然后再定义一个代练者
		GamePlayIH proxy = new GamePlayIH(player);
		
		//开始打游戏，记下时间戳
		System.out.println("开始时间是：2009-8-25 10:45");
		
		String str[] = {"zhangSan","password"};
		Class<?> type[] = {String.class,String.class};
		proxy.invoke(null, player.getClass().getMethod("login", type),str);
		//开始杀怪
		proxy.invoke(null, player.getClass().getMethod("killBoss", null),null);
		//升级
		proxy.invoke(null, player.getClass().getMethod("upgrade", null),null);

		//记录结束游戏时间
		System.out.println("结束时间是：2009-8-26 03:40");
		
	}
	
	

}
