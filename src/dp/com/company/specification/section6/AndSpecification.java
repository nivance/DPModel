package com.company.specification.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
//实现and操作
public class AndSpecification extends CompositeSpecification {
	//传递两个规格书进行and操作
	private ISpecification left;
	private ISpecification right;
	
	public AndSpecification(ISpecification _left,ISpecification _right){
		this.left = _left;
		this.right = _right;
	}
	
	//进行and运算
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		return left.isSatisfiedBy(candidate) && right.isSatisfiedBy(candidate);
	}

}
