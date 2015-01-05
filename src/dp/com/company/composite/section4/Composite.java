package com.company.composite.section4;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Composite extends Component {
	//构件容器
	private ArrayList<Component> componentArrayList = new ArrayList<Component>();
	
	//增加一个叶子构件或树枝构件
	public void add(Component component){
		this.componentArrayList.add(component);
	}
	
	//删除一个叶子构件或树枝构件
	public void remove(Component component){
		this.componentArrayList.remove(component);
	}
	
	//获得分支下的所有叶子构件和树枝构件
	public ArrayList<Component> getChildren(){
		return this.componentArrayList;
	}
}
