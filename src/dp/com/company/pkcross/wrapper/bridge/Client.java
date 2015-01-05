package com.company.pkcross.wrapper.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//声明出一个电影明星
		AbstractStar zhangSan = new FilmStar();
		//声明出一个歌星
		AbstractStar liSi = new Singer();
		
		//展示一下各个明星的主要工作
		zhangSan.doJob();
		liSi.doJob();
		
		//当然，也有部分明星不务正业，比如歌星演戏
		liSi = new Singer(new ActFilm());
		liSi.doJob();
	}
}
