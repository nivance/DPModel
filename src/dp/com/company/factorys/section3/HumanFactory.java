package com.company.factorys.section3;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 今天讲女娲造人的故事，这个故事梗概是这样的：
 * 很久很久以前，盘古开辟了天地，用身躯造出日月星辰、山川草木，天地一片繁华
 * One day，女娲下界走了一遭，哎！太寂寞，太孤独了，没个会笑的、会哭的、会说话的东东
 * 那怎么办呢？不用愁，女娲，神仙呀，造出来呀，然后捏泥巴，放八卦炉（后来这个成了太白金星的宝贝）中烤，于是就有了人：
 * 我们把这个生产人的过程用Java程序表现出来：
 */
public class HumanFactory {
	
	public static <T extends Human> T createHuman(Class<T> c){
		//定义一个生产的人种
		Human human=null;  	
		try {
			 //产生一个人种
			human = (Human)Class.forName(c.getName()).newInstance();  			
		} catch (Exception e) {
			System.out.println("人种生成错误！");
		}
		return (T)human;
	}
}
