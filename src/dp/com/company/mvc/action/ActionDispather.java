package com.company.mvc.action;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ActionDispather implements IActionDispather {
	//需要执行的Action
	private ActionManager actionManager = new ActionManager();
	
	//拦截器链
	private ArrayList<Interceptors> listInterceptors = InterceptorFactory.createInterceptors();
	
	public String actionInvoke(String actionName) {
		//前置拦截器
		return actionManager.execAction(actionName);
		//后置拦截器
	}

}
