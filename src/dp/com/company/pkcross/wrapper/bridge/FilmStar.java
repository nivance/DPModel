package com.company.pkcross.wrapper.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class FilmStar extends AbstractStar {
	
	//默认的电影明星应该是拍电影
	public FilmStar(){
		super(new ActFilm());
	}
	
	//也可以重新设置一个新职业，君不见明星跑穴的情况时有发生吗
	public FilmStar(AbstractAction _action){
		super(_action);
	}
	
	//细化电影明星的职责
	@Override
	public void doJob(){
		System.out.println("\n======电影明星的主要工作=====");
		super.doJob();
	}
}
