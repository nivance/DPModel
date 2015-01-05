package com.company.facade.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//现代化的邮局，有这项服务，邮局名称叫Hell Road
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		//你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
		//定义一个地址
		String address = "Happy Road No. 666,God Province,Heaven";
		//信的内容
		String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
		//你给我发送吧
		hellRoadPostOffice.sendLetter(context, address);
	}
}

