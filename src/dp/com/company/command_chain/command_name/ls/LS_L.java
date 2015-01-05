package com.company.command_chain.command_name.ls;

import com.company.command_chain.CommandVO;
import com.company.command_chain.command_name.os.FileManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ls -l 命令
 */
public class LS_L extends AbstractLS {

	protected String echo(CommandVO vo) {
		return FileManager.ls_l(vo.formatData());
	}

	//l参数
	protected String getOperateParam() {
		return L_PARAM;
	}

}
