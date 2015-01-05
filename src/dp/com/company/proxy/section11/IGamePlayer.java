package com.company.proxy.section11;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 游戏玩家
 */
public interface IGamePlayer {

	//登录游戏
	public void login(String user,String password);
	
	//杀怪，这是网络游戏的主要特色
	public void killBoss();
	
	//升级
	public void upgrade();
}
