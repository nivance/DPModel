package com.company.pkbehavior.command_vs_strategy.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface Algorithm {

	//压缩算法
	public boolean compress(String source,String to);

	//解压缩算法
	public boolean uncompress(String source,String to);
}
