package com.company.mvc.action;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IActionDispather {
	
	//根据action的名字，返回处理结果
	public String actionInvoke(String actionName);
}
