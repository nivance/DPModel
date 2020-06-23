package com.company.composite.session7;

import java.util.ArrayList;
import java.util.List;

/**
 * 区域块实现类
 */
public class Area extends Component {
	
	private List<Component> subComponents = new ArrayList<>();

	public Area(String name) {
		super(name);
	}
	
	public void addSubComponent(Component comp){
		comp.setParent(this);
		subComponents.add(comp);
	}

	public List<Component> getSubComponents(){
		return this.subComponents;
	}
}
