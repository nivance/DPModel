package com.company.decorator.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 老爸看成绩单了
 */
public class Father {
	
	public static void main(String[] args) {
		//成绩单拿过来
		SchoolReport sr = new FouthGradeSchoolReport();		
		//看成绩单
		sr.report();		
		//签名？休想！
	}
}

