package com.company.facade.section1;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all.
 */
public interface ILetterProcess {
	// 首先要写信的内容
	public void writeContext(String context);

	// 其次写信封
	public void fillEnvelope(String address);

	// 把信放到信封里
	public void letterInotoEnvelope();

	// 然后邮递
	public void sendLetter();
}
