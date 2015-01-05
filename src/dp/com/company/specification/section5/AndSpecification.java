package com.company.specification.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
//实现and操作
public class AndSpecification extends CompositeSpecification {
	//传递两个规格书进行and操作
	private IUserSpecification left;
	private IUserSpecification right;
	
	public AndSpecification(IUserSpecification _left,IUserSpecification _right){
		this.left = _left;
		this.right = _right;
	}
	
	//进行and运算
	@Override
	public boolean isSatisfiedBy(User user) {
		return left.isSatisfiedBy(user) && right.isSatisfiedBy(user);
	}

}
