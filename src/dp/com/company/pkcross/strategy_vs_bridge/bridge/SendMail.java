package com.company.pkcross.strategy_vs_bridge.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SendMail extends MailServer {
	//传递一份邮件
	public SendMail(MailTemplate _m) {
		super(_m);
	}

	//修正邮件发送程序
	@Override
	public void sendMail(){
		//增加邮件服务器信息
		super.m.add("Received: (sendmail); 7 Nov 2009 04:14:44 +0100");
		super.sendMail();
	}
}
