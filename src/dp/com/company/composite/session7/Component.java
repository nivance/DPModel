package com.company.composite.session7;


/**
 * 父类
 */
public abstract class Component {
	private String name;
	
	private Component parent;
	
	public Component(String name) {
		this.name = name;
	}
	
	public void setParent(Component parent) {
		this.parent = parent;
	}

	public Component getParent() {
		return this.parent;
	}
	
	public String getName() {
		return name;
	}
}
