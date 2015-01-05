package com.company.pkcross.wrapper.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Singer extends AbstractStar {
	
	//默认的歌星明星应该是唱歌
	public Singer(){
		super(new Sing());
	}
	
	//也可以重新设置一个新职业
	public Singer(AbstractAction _action){
		super(_action);
	}
	
	//细化歌星明星的职责
	@Override
	public void doJob(){
		System.out.println("\n======歌星明星的主要工作=====");
		super.doJob();
	}
}
