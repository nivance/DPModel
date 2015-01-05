package com.company.template_method.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class HummerH1Model extends HummerModel {
	//H1型号的悍马车鸣笛
	public void alarm() {
		System.out.println("悍马H1鸣笛...");
	}

	//引擎轰鸣声
	public void engineBoom() {
		System.out.println("悍马H1引擎声音是这样在...");
	}

	//汽车发动
	public void start() {
		System.out.println("悍马H1发动...");
	}
	
	//停车
	public void stop() {
		System.out.println("悍马H1停车...");
	}
	
	//开动起来
	public void run(){

		//先发动汽车
		this.start();
		
		//引擎开始轰鸣
		this.engineBoom();
		
		//然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
		this.alarm();
		
		//到达目的地就停车
		this.stop();

	}

}
