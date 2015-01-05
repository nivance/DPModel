package com.company.lsp.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 狙击手，为什么叫Snipper？snipe翻译过来就是鹬，就是鹬蚌相争，渔翁得利中的那个动物
 * 英国贵族到印度打猎，发现这个鹬很聪明，人一靠近就飞走了，没办法就开始伪装、远程精准射击，于是乎
 * snipper就诞生了
 */
public class Snipper {
	//定义一个狙击枪
	private AUG aug;
	
	//给狙击手一般狙击枪
	public void setRifle(AUG _aug){
		this.aug = _aug;
	}
	
	public void killEnemy(){
		//首先看看敌人的情况，别杀死敌人，自己也被人干掉
		aug.zoomOut();
		//开始射击
		aug.shoot();
	}
}
