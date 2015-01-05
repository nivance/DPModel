package com.company.memento.section8;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Caretaker {
	//容纳备忘录的容器
	private HashMap<String,Memento> memMap = new HashMap<String,Memento>();

	public Memento getMemento(String idx) {
		return memMap.get(idx);
	}

	public void setMemento(String idx,Memento memento) {
		this.memMap.put(idx, memento);
	}
	
}
