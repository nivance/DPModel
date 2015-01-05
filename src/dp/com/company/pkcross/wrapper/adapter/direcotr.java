package com.company.pkcross.wrapper.adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class direcotr {

	public static void main(String[] args) {
		System.out.println("\n=======演戏过程模拟==========\n");
		//定义一个大明星
		IStar star = new FilmStar();
		star.act("前十五分钟，明星本人演戏");
		
		//导演把一个普通演员认为是一个明星演员
		IActor actor = new UnknownActor();
		IStar standin= new Standin(actor);
		standin.act("中间五分钟，替身在演戏");
		
		star.act("后十五分钟，明星本人演戏");
		
	}
}
