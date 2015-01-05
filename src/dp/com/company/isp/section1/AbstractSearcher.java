package com.company.isp.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 星探，搜索美女
 */
public abstract class AbstractSearcher {
	protected IPettyGirl pettyGirl;
	public AbstractSearcher(IPettyGirl _pettyGirl){
		this.pettyGirl = _pettyGirl;
	}
	
	//搜索美女，列出美女信息
	public abstract void show();
}
