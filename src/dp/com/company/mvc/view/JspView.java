package com.company.mvc.view;

import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class JspView extends AbsView {
	
	//传递一个语言配置文件
	public JspView(AbsLangData _langData){
		super(_langData);
	}

	@Override
	public void assemble() {
		Map<String,String> langMap = getLangData().getItems();
		for(String key:langMap.keySet()){
			/*
			 * 直接替换文件中的语言条目
			 * 
			 */
		}
		
	}

}
