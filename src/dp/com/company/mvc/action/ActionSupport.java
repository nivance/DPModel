package com.company.mvc.action;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class ActionSupport {
	public final static String SUCCESS = "success";
	public final static String FAIL = "fail";
	
	//默认的执行方法
	public String execute(){
		return SUCCESS;
	}
}
