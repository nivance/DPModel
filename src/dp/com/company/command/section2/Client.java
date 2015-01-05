package com.company.command.section2;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 客户就是甲方，给我们钱的一方，是老大
 */
public class Client {
	
	public static void main(String[] args) {
		//定义我们的接头人
		Invoker xiaoSan = new Invoker();  //接头人就是我小三
		
		//客户要求增加一项需求
		System.out.println("-------------客户要求删除一个页面-----------------");
		//客户给我们下命令来
		//Command command = new AddRequirementCommand();
		Command command = new DeletePageCommand();
		
		//接头人接收到命令
		xiaoSan.setCommand(command);
		
		//接头人执行命令
		xiaoSan.action();
		
	}
}
