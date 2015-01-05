package com.company.command_chain.command_name.os;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DiskManager {
	
	//默认的计算大小
	public static String df(){
		return "/\t10485760\n/usr\t104857600\n/home\t1048576000\n";
	}
	
	//按照kb来计算
	public static String df_k(){
		return "/\t10240\n/usr\t102400\n/home\tt10240000\n";
	}
	
	//按照gb计算
	public static String df_g(){
		return "/\t10\n/usr\t100\n/home\tt10000\n";
	}
	
	public static void main(String[] args) {
		System.out.println(df());
	}
}
