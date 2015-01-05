package com.company.state.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 定义一个电梯的接口
 */
public interface ILift {
	
	//首先电梯门开启动作
	public void open();
	
	//电梯门有开启，那当然也就有关闭了
	public void close();
	
	//电梯要能上能下，跑起来
	public void run();
	
	//电梯还要能停下来，停不下来那就扯淡了
	public void stop();
}
