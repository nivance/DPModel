package com.company.state.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class State {

	//定义一个环境角色，提供子类访问
	protected Context context;
	
	//设置环境角色
	public void setContext(Context _context){
		this.context = _context;
	}
	
	//行为1
	public abstract void handle1();
	
	//行为2
	public abstract void handle2();
}
