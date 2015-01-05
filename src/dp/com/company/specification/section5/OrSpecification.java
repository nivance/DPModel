package com.company.specification.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class OrSpecification extends CompositeSpecification {
	//左右两个规格书
	private IUserSpecification left;
	private IUserSpecification right;
	
	public OrSpecification(IUserSpecification _left,IUserSpecification _right){
		this.left = _left;
		this.right = _right;
	}
	
	//or运算
	@Override
	public boolean isSatisfiedBy(User user) {
		return left.isSatisfiedBy(user) || right.isSatisfiedBy(user);
	}

}
