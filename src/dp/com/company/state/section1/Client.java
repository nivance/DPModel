package com.company.state.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 模拟电梯的动作
 */
public class Client {
	
	public static void main(String[] args) {
		ILift lift = new Lift();
	
		//首先是电梯门开启，人进去
		lift.open();
		
		//然后电梯门关闭
		lift.close();
		
		//再然后，电梯跑起来，向上或者向下
		lift.run();
		
		//最后到达目的地，电梯挺下来
		lift.stop();
	}
}
