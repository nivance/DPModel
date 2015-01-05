package com.company.command_chain.command_name.ls;

import com.company.command_chain.CommandVO;
import com.company.command_chain.command_name.os.FileManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 命令名后面不跟参数
 */
public class LS extends AbstractLS {

	//最简单的ls命令
	protected String echo(CommandVO vo) {
		return FileManager.ls(vo.formatData());
	}

	//参数为空
	protected String getOperateParam() {
		return DEFAULT_PARAM;
	}

}
