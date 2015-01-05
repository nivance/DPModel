package com.company.specification.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class NotSpecification extends CompositeSpecification {
	//传递一个规格书
	private ISpecification spec;
	
	public NotSpecification(ISpecification _spec){
		this.spec = _spec;
	}
	
	//not操作
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		return !spec.isSatisfiedBy(candidate);
	}

}
