package com.company.decorator.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Decorator extends Component {
	private Component component = null;
	
	//通过构造函数传递被修饰者
	public Decorator(Component _component){
		this.component = _component;
	}
	
	//委托给被修饰者执行
	@Override
	public void operate() {
		this.component.operate();
	}

}
