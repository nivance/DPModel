package com.company.lod.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 业务场景
 */
public class Client {
	
	public static void main(String[] args) {
		InstallSoftware invoker = new InstallSoftware();
		invoker.installWizard(new Wizard());
	}
}
