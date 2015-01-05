package com.company.memento.section9;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Originator {
	
	//内部状态
	private String state = "";
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//创建一个备忘录
	public IMemento createMemento(){
		return new Memento(this.state);
	}
	
	//恢复一个备忘录
	public void restoreMemento(IMemento _memento){
		this.setState(((Memento)_memento).getState());
	}
	
	//内置类
	private class Memento implements IMemento{
		
		//发起人的内部状态
		private String state = "";
		
		//构造函数传递参数
		private Memento(String _state){
			this.state = _state;
		}
		
		private String getState() {
			return state;
		}

		private void setState(String state) {
			this.state = state;
		}
		
	}

}
