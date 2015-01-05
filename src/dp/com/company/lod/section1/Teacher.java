package com.company.lod.section1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 老师类
 */
public class Teacher {
	
	//老师对学生发布命令,清一下女生
	public void commond(GroupLeader groupLeader){
		List<Girl> listGirls = new ArrayList<Girl>();
		//初始化女生
		for(int i=0;i<20;i++){
			listGirls.add(new Girl());
		}
		
		//告诉体育委员开始执行清查任务
		groupLeader.countGirls(listGirls);
	}
}
