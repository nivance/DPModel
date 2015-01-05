package com.company.pkcross.strategy_vs_bridge.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class TextMail extends MailTemplate {


	public TextMail(String _from, String _to, String _subject, String _context) {
		super(_from, _to, _subject, _context);
	}

	@Override
	public String getContext() {
		//文本类型则设置邮件的格式为：text/plain
		String context = "\nContent-Type: text/plain;charset=GB2312\n" +super.getContext();
		//同时对邮件进行base64编码处理,这里用一句话代替
		context = context + "\n邮件格式为：文本格式";
		return context;
	}

}
