package com.company.command_chain.command_name;

import com.company.command_chain.CommandVO;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 充当Handler
 */
public abstract class CommandName {
	
	private CommandName nextOperator;

	public final String handleMessage(CommandVO vo){
		//处理结果
		String result = "";
		
		//判断是否是自己处理的参数
		if(vo.getParam().size() == 0 || vo.getParam().contains(this.getOperateParam())){
			result = this.echo(vo);
		}else{
			if(this.nextOperator !=null){
				result = this.nextOperator.handleMessage(vo);
			}else{
				result = "命令无法执行";
			}
		}

		return result;
	}
	

	//设置剩余参数谁来处理
	public void setNext(CommandName _operator){
		this.nextOperator = _operator;
	}

	//每个处理者都要处理一个后缀参数
	protected abstract String getOperateParam();
	
	//每个处理者都必须实现处理任务
	protected abstract String echo(CommandVO vo);
	
}
