package com.company.lod.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 我们使用Client来描绘一下这个场景
 */
public class Client {

	public static void main(String[] args) {
		Teacher teacher= new Teacher();
		
		//老师发布命令
		teacher.commond(new GroupLeader());
	}
	
}
