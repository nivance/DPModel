package com.company.command_chain.command_name.df;

import com.company.command_chain.CommandVO;
import com.company.command_chain.command_name.os.DiskManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DF_G extends AbstractDF{
	//定义一下自己能处理什么参数
	protected String getOperateParam() {
		return G_PARAM;
	}
	
	//命令处理
	protected String echo(CommandVO vo) {
		return DiskManager.df_g();
	}
}
