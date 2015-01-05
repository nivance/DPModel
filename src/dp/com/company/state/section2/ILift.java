package com.company.state.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 定义一个电梯的接口
 */
public interface ILift {
	//电梯的四个状态
	public final static int OPENING_STATE = 1;  //门敞状态
	public final static int CLOSING_STATE = 2;  //门闭状态
	public final static int RUNNING_STATE = 3;  //运行状态
	public final static int STOPPING_STATE = 4; //停止状态；
	
	//设置电梯的状态
	public void setState(int state);
	
	//首先电梯门开启动作
	public void open();
	
	//电梯门有开启，那当然也就有关闭了
	public void close();
	
	//电梯要能上能下，跑起来
	public void run();
	
	//电梯还要能停下来，停不下来那就扯淡了
	public void stop();
}
