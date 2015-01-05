package com.company.observer.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 所有被观察者者，通用接口
 */
public interface Observable {
	
	//增加一个观察者
	public void addObserver(Observer observer);
	
	//删除一个观察者，——我不想让你看了
	public void deleteObserver(Observer observer);
	
	//既然要观察，我发生改变了他也应该用所动作——通知观察者
	public void notifyObservers(String context);
}
