package com.company.observer_mediator.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public enum ProductEventType {
	//新建一个产品
	NEW_PRODUCT(1),
	//删除一个产品
	DEL_PRODUCT(2),
	//修改一个产品
	EDIT_PRODUCT(3),
	//克隆一个产品
	CLONE_PRODUCT(4);
	
	private int value=0;
	private ProductEventType(int _value){
		this.value = _value;
	}
	
	public int getValue(){
		return this.value;
	}
}

