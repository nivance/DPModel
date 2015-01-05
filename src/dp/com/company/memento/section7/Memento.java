package com.company.memento.section7;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Memento {
	
	//接受HashMap作为状态
	private HashMap<String,Object> stateMap;
	
	//接受一个对象，建立一个备份
	public Memento(HashMap<String,Object> map){
		this.stateMap = map;
	}

	public HashMap<String,Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(HashMap<String,Object> stateMap) {
		this.stateMap = stateMap;
	}
	
	
	
}
