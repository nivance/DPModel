package com.company.pkcross.command_vs_strategy.command;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class GzipUncompressCmd extends AbstractCmd {

	public boolean execute(String source,String to) {
		return super.uncompress.gzipExec(source, to);
	}

}
