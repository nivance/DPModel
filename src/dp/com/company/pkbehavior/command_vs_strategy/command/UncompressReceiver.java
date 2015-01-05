package com.company.pkbehavior.command_vs_strategy.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UncompressReceiver implements IReceiver {

	//执行gzip解压缩命令
	public boolean gzipExec(String source, String to) {
		System.out.println(source + " --> " +to + " GZIP解压缩成功!");
		return true;
	}

	//执行zip解压缩命令
	public boolean zipExec(String source, String to) {
		System.out.println(source + " --> " +to + " ZIP解压缩成功!");
		return true;
	}

}
