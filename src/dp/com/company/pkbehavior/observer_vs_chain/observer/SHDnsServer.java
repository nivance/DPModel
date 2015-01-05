package com.company.pkbehavior.observer_vs_chain.observer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SHDnsServer extends DnsServer {

	@Override
	protected void sign(Recorder recorder) {		
		recorder.setOwner("上海DNS服务器");
	}

	//定义上海的DNS服务器能处理的级别
	@Override
	protected boolean isLocal(Recorder recorder) {
		return recorder.getDomain().endsWith(".sh.cn");
	}

}
