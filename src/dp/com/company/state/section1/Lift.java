package com.company.state.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 电梯的实现类
 */
public class Lift implements ILift {

	//电梯门关闭
	public void close() {
		System.out.println("电梯门关闭...");
	}
		
	//电梯门开启
	public void open() {
		System.out.println("电梯门开启...");
	}
	
	//电梯开始跑起来
	public void run() {
		System.out.println("电梯上下跑起来...");

	}

	//电梯停止
	public void stop() {
		System.out.println("电梯停止了...");
	}
}
		