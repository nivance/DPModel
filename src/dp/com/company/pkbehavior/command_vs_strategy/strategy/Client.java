package com.company.pkbehavior.command_vs_strategy.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//定义环境角色
		Context context;
		//对文件执行zip压缩算法
		System.out.println("========执行算法========");
		context = new Context(new Zip());
		/*
		 *算法替换
		 * context = new Context(new Gzip());
		 * 
		 */
		
		//执行压缩算法
		context.compress("c:\\windows","d:\\windows.zip");
		//执行解压缩算法
		context.uncompress("c:\\windows.zip","d:\\windows");
	}
}
