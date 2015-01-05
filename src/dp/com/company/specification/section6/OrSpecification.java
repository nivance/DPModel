package com.company.specification.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OrSpecification extends CompositeSpecification {
	//左右两个规格书
	private ISpecification left;
	private ISpecification right;
	
	public OrSpecification(ISpecification _left,ISpecification _right){
		this.left = _left;
		this.right = _right;
	}
	
	//or运算
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		return left.isSatisfiedBy(candidate) || right.isSatisfiedBy(candidate);
	}

}
