package com.company.memento.section9;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Caretaker {
	
	//备忘录对象
	private IMemento memento;

	public IMemento getMemento() {
		return memento;
	}

	public void setMemento(IMemento memento) {
		this.memento = memento;
	}
	
}
