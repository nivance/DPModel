package com.company.template_method.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class HummerModel {

	/*
	 * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
	 * 是要能够发动起来，那这个实现要在实现类里了
	 */
	public abstract void start();
	
	//能发动，那还要能停下来，那才是真本事
	public abstract void stop();
	
	//喇叭会出声音，是滴滴叫，还是哔哔叫
	public abstract void alarm();
	
	//引擎会轰隆隆的响，不响那是假的
	public abstract void engineBoom();
	
	//那模型应该会跑吧，别管是人推的，还是电力驱动，总之要会跑
	public abstract void run();

}
