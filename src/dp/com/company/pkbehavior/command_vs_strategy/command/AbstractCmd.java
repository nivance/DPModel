package com.company.pkbehavior.command_vs_strategy.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractCmd {
	//对接收者的应用
	protected IReceiver compress = new CompressReceiver();
	protected IReceiver uncompress = new UncompressReceiver();
	
	//抽象方法，命令的具体单元
	public abstract boolean execute(String source,String to);
}
