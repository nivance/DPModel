package com.company.mvc.helper;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class ActionNode {
	
	//action的名称
	private String actionName;
	//action的类名
	private String actionClass;
	//方法名, 默认是execute
	private String methodName = "excuete";
	//视图路径
	private String view;
	
	
	public String getActionName() {
		return actionName;
	}

	public String getActionClass() {
		return actionClass;
	}

	public String getMethodName() {
		return methodName;
	}

	public abstract String getView(String Result);

	
}
