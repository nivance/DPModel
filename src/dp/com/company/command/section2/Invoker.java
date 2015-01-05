package com.company.command.section2;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 接头人的职责就是接收命令，并执行
 */
public class Invoker {
	//什么命令
	private Command command;
	
	//客户发出命令
	public void setCommand(Command command){
		this.command = command;
	}
	
	//执行客户的命令
	public void action(){
		this.command.execute();
	}
}
