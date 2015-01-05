package com.company.pkcross.command_vs_strategy.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IReceiver {
	
	//执行zip命令
	public boolean zipExec(String source,String to);
	
	//执行gzip命令
	public boolean gzipExec(String source,String to);
}
