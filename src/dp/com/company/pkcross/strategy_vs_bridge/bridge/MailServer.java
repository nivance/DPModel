package com.company.pkcross.strategy_vs_bridge.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class MailServer {
	
	//发送的是哪封邮件
	protected final MailTemplate m;
	
	public MailServer(MailTemplate _m){
		this.m  = _m;
	}
	
	//发送邮件
	public void sendMail(){
		System.out.println("====正在发送的邮件信息====");
		//发件人
		System.out.println("发件人：" + m.getFrom());
		//收件人
		System.out.println("收件人：" + m.getTo());
		//标题
		System.out.println("邮件标题：" + m.getSubject() );
		//邮件内容
		System.out.println("邮件内容：" + m.getContext());
	}
}
