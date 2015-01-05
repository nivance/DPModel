package com.company.observer_mediator.section2;

import java.util.Observable;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ProductEvent extends Observable{
	//事件起源
	private Product source;
	//事件的类型
	private ProductEventType type;
		
	//传入事件的源头,默认为新建类型
	public ProductEvent(Product p) {
		this(p,ProductEventType.NEW_PRODUCT);
	}
	
	//事件源头以及事件类型
	public ProductEvent(Product p,ProductEventType _type){	
		this.source = p;
		this.type = _type;
		//事件触发
		notifyEventDispatch();
	}
	
	//获得事件的始作俑者
	public Product getSource(){
		return source;
	}
	
	//获得事件的类型
	public ProductEventType getEventType(){
		return this.type;
	}
	
	//通知事件处理中心
	private void notifyEventDispatch(){
		super.addObserver(EventDispatch.getEventDispathc());
		super.setChanged();
		super.notifyObservers(source);
	}
}
