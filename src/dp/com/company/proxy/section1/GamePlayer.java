package com.company.proxy.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 真是的玩家
 */
public class GamePlayer implements IGamePlayer {
	private String name = "";
	
	//通过构造函数传递名称
	public GamePlayer(String _name){
		this.name = _name;
	}
		
	//打怪，最期望的就是杀老怪
	public void killBoss() {
		System.out.println(this.name + "在打怪！");
	}
	
	//进游戏之前你肯定要登录吧，这是一个必要条件
	public void login(String user, String password) {
		System.out.println("登录名为"+user + " 的用户 " + this.name + "登录成功！");
	}

	//升级，升级有很多方法，花钱买是一种，做任务也是一种
	public void upgrade() {
		System.out.println(this.name + " 又升了一级！");
	}

}
