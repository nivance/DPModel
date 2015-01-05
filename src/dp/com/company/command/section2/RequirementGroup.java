package com.company.command.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 需求组的职责是和甲方谈定需求，这个组的人应该都是业务领域专家
 */
public class RequirementGroup extends Group {
	
	//客户要求需求组过去和他们谈
	public void find() {
		System.out.println("找到需求组...");
	}

	//客户要求增加一项需求
	public void add() {
		System.out.println("客户要求增加一项需求...");
	}

	//客户要求修改一项需求
	public void change() {
		System.out.println("客户要求修改一项需求...");
	}

	//客户要求删除一项需求
	public void delete() {
		System.out.println("客户要求删除一项需求...");
	}

	//客户要求出变更计划
	public void plan() {
		System.out.println("客户要求需求变更计划...");
	}

}
