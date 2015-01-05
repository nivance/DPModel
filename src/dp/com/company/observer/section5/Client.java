package com.company.observer.section5;

import java.util.Observer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 这个Client就是我们，用我们的视角看待这段历史
 */
public class Client {
	
	public static void main(String[] args) {
		//三个观察者产生出来
		Observer liSi = new LiSi();
		Observer wangSi = new WangSi();
		Observer liuSi = new LiuSi();
		
		//定义出韩非子
		HanFeiZi hanFeiZi = new HanFeiZi();
		
		//我们后人根据历史，描述这个场景，有三个人在观察韩非子
		
		hanFeiZi.addObserver(wangSi);
		hanFeiZi.addObserver(liuSi);
		hanFeiZi.addObserver(liSi);
		
		//然后这里我们看看韩非子在干什么
		hanFeiZi.haveBreakfast();		
	}
}
