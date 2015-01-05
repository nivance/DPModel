package com.company.specification.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IUserSpecification {
	
	//候选者是否满足要求
	public boolean isSatisfiedBy(User user);	
	
	//and操作
	public IUserSpecification and(IUserSpecification spec);
	
	//or操作
	public IUserSpecification or(IUserSpecification spec);
	
	//not操作
	public IUserSpecification not();
}

