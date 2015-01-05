package com.company.proxy.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 真是的玩家
 */
public class GamePlayer implements IGamePlayer {
	private String name = "";
	//我的代理是谁
	private IGamePlayer proxy = null;
		
	public GamePlayer(String _name){
		this.name = _name;	
	}
	
	//找到自己的代理
	public IGamePlayer getProxy(){
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}
	
	//打怪，最期望的就是杀老怪
	public void killBoss() {
		if(this.isProxy()){
			System.out.println(this.name + "在打怪！");
		}else{
			System.out.println("请使用指定的代理访问");
		}
		
	}
	
	//进游戏之前你肯定要登录吧，这是一个必要条件
	public void login(String user, String password) {
		if(this.isProxy()){
			System.out.println("登录名为"+user + " 的用户 " + this.name + "登录成功！");
		}else{
			System.out.println("请使用指定的代理访问");;
		}
		
	}

	//升级，升级有很多方法，花钱买是一种，做任务也是一种
	public void upgrade() {
		if(this.isProxy()){
			System.out.println(this.name + " 又升了一级！");
		}else{
			System.out.println("请使用指定的代理访问");
		}
	}
	
	//校验是否是代理访问
	private boolean isProxy(){
		if(this.proxy == null){
			return false;
		}else{
			return true;
		}
	}
}
