package com.company.command.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 删除一个页面的命令
 */
public class DeletePageCommand extends Command {
	
	//执行删除一个页面的命令
	public void execute() {
		//找到页面组
		super.pg.find();
		
		//删除一个页面
		super.rg.delete();
		
		//给出计划
		super.rg.plan();
	}

}
