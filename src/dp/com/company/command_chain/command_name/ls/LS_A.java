package com.company.command_chain.command_name.ls;

import com.company.command_chain.CommandVO;
import com.company.command_chain.command_name.os.FileManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class LS_A extends AbstractLS {
	//ls -a命令
	protected String echo(CommandVO vo) {
		return FileManager.ls_a(vo.formatData());
	}

	
	protected String getOperateParam() {
		return A_PARAM;
	}

}
