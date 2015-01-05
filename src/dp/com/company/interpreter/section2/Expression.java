package com.company.interpreter.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Expression {
	
	//每个表达式必须有一个解析任务
	public abstract Object interpreter(Context  ctx);
}
