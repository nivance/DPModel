package com.company.flyweight.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class MultiThread extends Thread {
	private SignInfo signInfo;
	public MultiThread(SignInfo _signInfo){
			this.signInfo = _signInfo;

	}
	
	public void run(){
		if(!signInfo.getId().equals(signInfo.getLocation())){
			System.out.println("编号："+signInfo.getId());
			System.out.println("考试地址："+signInfo.getLocation());
			System.out.println("线程不安全了！");
		}
		
	}
}