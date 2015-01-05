package com.company.lod.section3;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 业务组装类，负责调用各个步骤
 */
public class InstallSoftware {
	
	public void installWizard(Wizard wizard){
		int first = wizard.first();  
		//根据first返回的结果，看是否需要执行second
		if(first>50){
			int second = wizard.second();
			if(second>50){
				int third = wizard.third();
				if(third >50){
					wizard.first();
				}
			}
		}
		
	}
}
