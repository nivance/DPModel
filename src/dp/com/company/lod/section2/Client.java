package com.company.lod.section2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 我们使用Client来描绘一下这个场景
 */
public class Client {

	public static void main(String[] args) {
		//产生一个女生群体
		List<Girl> listGirls = new ArrayList<Girl>();
		//初始化女生
		for(int i=0;i<20;i++){
			listGirls.add(new Girl());
		}
			
		Teacher teacher= new Teacher();
		
		//老师发布命令
		teacher.commond(new GroupLeader(listGirls));
	}
	
}
