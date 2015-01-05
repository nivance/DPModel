package com.company.specification.section6;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface ISpecification {
	
	//候选者是否满足要求
	public boolean isSatisfiedBy(Object candidate);	
	
	//and操作
	public ISpecification and(ISpecification spec);
	
	//or操作
	public ISpecification or(ISpecification spec);
	
	//not操作
	public ISpecification not();
}
