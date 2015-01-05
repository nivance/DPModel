package com.company.flyweight.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SignInfo4Pool extends SignInfo {
	
	//定义一个对象池提取的KEY值
	private String key;
	
	//构造函数获得相同标志
	public SignInfo4Pool(String _key){
		this.key = _key;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
}
