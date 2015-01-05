package com.company.pkbehavior.command_vs_strategy.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Invoker {
	//抽象命令的引用
	private AbstractCmd cmd;
	public Invoker(AbstractCmd _cmd){
		this.cmd = _cmd;
	}
	
	//执行命令
	public boolean execute(String source,String to){
		return cmd.execute(source, to);
	}
	
}
