package com.company.memento.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Boy {
	
	//男孩的状态
	private String state = "";
	
	//任何女孩子后状态肯定改变，比如心情、手中的花朵等等
	public void changeState(){
		this.state = "心情可能很不好";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
