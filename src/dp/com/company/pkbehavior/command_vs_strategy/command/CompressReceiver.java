package com.company.pkbehavior.command_vs_strategy.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class CompressReceiver implements IReceiver {

	//执行gzip压缩命令
	public boolean gzipExec(String source, String to) {
		System.out.println(source + " --> " +to + " GZIP压缩成功!");
		return true;
	}

	//执行zip压缩命令
	public boolean zipExec(String source, String to) {
		System.out.println(source + " --> " +to + " ZIP压缩成功!");
		return true;
	}

}
