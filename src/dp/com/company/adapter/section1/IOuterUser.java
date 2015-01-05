package com.company.adapter.section1;

import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 外系统的人员信息
 */
@SuppressWarnings("all")
public interface IOuterUser {
	
	//基本信息，比如名称，性别，手机号码了等
	public Map getUserBaseInfo();
	
	//工作区域信息
	public Map getUserOfficeInfo();
	
	//用户的家庭信息
	public Map getUserHomeInfo();
	
}
