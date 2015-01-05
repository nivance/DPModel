package com.company.command_chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 所有的命令在这里定义
 */
public enum CommandEnum {
	ls("com.company.command.LSCommand"),
	df("com.company.command.DFCommand");
	
	private String value = "";
	
	//定义构造函数，目的是Data(value)类型的相匹配
	private CommandEnum(String value){
		this.value = value;
	}
	
	
	public String getValue(){
		return this.value;
	}
	
	//返回所有的enum对象
	public static List<String> getNames(){
		CommandEnum[] commandEnum = CommandEnum.values();
		List<String> names = new ArrayList<String>();
		for(CommandEnum c:commandEnum){
			names.add(c.name());
		}
		
		return names;
	}
	
}
