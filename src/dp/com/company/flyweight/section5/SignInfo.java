package com.company.flyweight.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SignInfo {
	
	//报名人员的ID
	private String id;
	//邮寄地址
	private String postAddress;
	//外部状态
	private ExtrinsicState state;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostAddress() {
		return postAddress;
	}
	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}
	public ExtrinsicState getState() {
		return state;
	}
	public void setState(ExtrinsicState state) {
		this.state = state;
	}
	
	
}
