package com.company.pkcross.strategy_vs_bridge.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Postfix extends MailServer {

	public Postfix(MailTemplate _m) {
		super(_m);

	}
	
	//修正邮件发送程序
	@Override
	public void sendMail(){
		//增加邮件服务器信息
		String context ="Received: from XXXX (unknown [xxx.xxx.xxx.xxx]) by aaa.aaa.com (Postfix) with ESMTP id 8DBCD172B8\n" ;		
		super.m.add(context);
		super.sendMail();
	}
}
