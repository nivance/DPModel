package com.company.chain_of_responsibility.section1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 我们后人来看这样的社会道德
 */
@SuppressWarnings("all")
public class Client {
	
	public static void main(String[] args) {
		//随机挑选几个女性
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList();
		for(int i=0;i<5;i++){
			arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
		}

		//定义三个请示对象
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();
		
		for(IWomen women:arrayList){
			if(women.getType() ==1){ //未结婚少女，请示父亲
				System.out.println("\n--------女儿向父亲请示-------");
				father.HandleMessage(women);
			}else if(women.getType() ==2){  //已婚少妇，请示丈夫
				System.out.println("\n--------妻子向丈夫请示-------");
				husband.HandleMessage(women);
			}else if(women.getType() == 3){ //母亲请示儿子
				System.out.println("\n--------母亲向儿子请示-------");
				son.HandleMessage(women);
			}else{
				//暂时啥也不做
			}
		}

	}
	
	

}
