package com.company.lsp.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * G3狙击步枪
 */
public class AUG extends Rifle {
	
	//狙击枪都是携带一个精准的望远镜
	public void zoomOut(){
		System.out.println("通过望远镜观看敌人...");
	}
	
	@Override
	public void shoot(){
		System.out.println("AUG射击...");
	}
}
