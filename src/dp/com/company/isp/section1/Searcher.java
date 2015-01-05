package com.company.isp.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 星探
 */
public class Searcher extends AbstractSearcher{
	public Searcher(IPettyGirl _pettyGirl){
		super(_pettyGirl);
	}
	
	//展示美女的信息
	public void show(){
		System.out.println("--------美女的信息如下：---------------");
		//展示面容
		super.pettyGirl.goodLooking();
		//展示身材
		super.pettyGirl.niceFigure();
		//展示气质
		super.pettyGirl.greatTemperament();
	}
}
