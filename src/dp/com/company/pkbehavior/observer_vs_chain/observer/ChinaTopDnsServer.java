package com.company.pkbehavior.observer_vs_chain.observer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ChinaTopDnsServer extends DnsServer {


	@Override
	protected void sign(Recorder recorder) {
		recorder.setOwner("中国顶级DNS服务器");
	}
	
	@Override
	protected boolean isLocal(Recorder recorder) {
		return recorder.getDomain().endsWith(".cn");
	}

}
