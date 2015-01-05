package com.company.visitor.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class KungFuRole implements Role {
	//武功天子第一的角色
	public void accept(AbsActor actor){
		actor.act(this);
	}
}
