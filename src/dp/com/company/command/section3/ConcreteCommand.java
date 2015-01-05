package com.company.command.section3;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteCommand extends Command {
	//也对那个Receiver类进行命令处理
	private Receiver receiver;
	
	//构造函数传递接收者
	public ConcreteCommand(Receiver _receiver){
		this.receiver = _receiver;
	}
	
	//每个具体的命令都必须实现一个命令
	public void execute() {
		//业务处理
		this.receiver.doSomething();
	}

}
