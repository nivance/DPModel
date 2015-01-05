package com.company.pkbehavior.observer_vs_chain.chain;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class TopDnsServer extends DnsServer {


	@Override
	protected Recorder echo(String domain) {
		Recorder recorder = super.echo(domain);
		recorder.setOwner("全球顶级DNS服务器");
		return recorder;
	}

	
	@Override
	protected boolean isLocal(String domain) {
		//所有的域名最终的解析地点
		return true;
	}

}
