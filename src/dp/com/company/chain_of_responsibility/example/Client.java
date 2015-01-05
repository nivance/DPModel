package com.company.chain_of_responsibility.example;


/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 
 */

public class Client {

	public static void main(String[] args) {
		// 声明出所有的处理节点
		Handler pm = new PM();
		Handler dm = new DM();
		Handler vp = new VP();
		// 设置链中的阶段顺序,1-->2-->3
		pm.setNext(dm);
		dm.setNext(vp);
		// 提交请求，返回结果
		Response response1 = pm.handlerMessage(new Request(1));
		
		Response response2 = pm.handlerMessage(new Request(2));
		
		Response response3 = pm.handlerMessage(new Request(3));
	}

}
