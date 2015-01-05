package com.company.adapter.section3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	/* 
	 * 员工的家庭信息
	 */
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		
		homeInfo.put("homeTelNumbner", "员工的家庭电话是....");
		homeInfo.put("homeAddress", "员工的家庭地址是....");
		
		return homeInfo;
	}
}
