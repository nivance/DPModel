package com.company.lod.section2;

import java.util.List;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 体育委员，这个太难翻译了都是中国的特色词汇
 */
public class GroupLeader {
	private List<Girl> listGirls;
	//传递全班的女生进来
	public GroupLeader(List<Girl> _listGirls){
		this.listGirls = _listGirls;
	}
	
	//有清查女生的工作
	public void countGirls(){

		System.out.println("女生数量是："+this.listGirls.size());
	}
}
