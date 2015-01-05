package com.company.adapter.section3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	/* 
	 * 员工的工作信息，比如职位了等
	 */
	public Map<String, String> getUserOfficeInfo() {
		Map<String, String> officeInfo = new HashMap<String, String>();
		
		officeInfo.put("jobPosition","这个人的职位是BOSS...");
		officeInfo.put("officeTelNumber", "员工的办公电话是....");
		
		return officeInfo;
	}

}
