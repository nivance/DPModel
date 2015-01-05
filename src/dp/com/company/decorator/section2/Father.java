package com.company.decorator.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 老爸看成绩单了
 */
public class Father {
	
	public static void main(String[] args) {
		//成绩单拿过来
		SchoolReport sr;
		sr = new FouthGradeSchoolReport();  //原装的成绩单
		
		//加 了最高分说明的成绩单
		sr = new HighScoreDecorator(sr);
		
		//又加了成绩排名的说明
		sr = new SortDecorator(sr);
		
		//看成绩单
		sr.report();
		
		//然后老爸，一看，很开心，就签名了
		sr.sign("老三");  //我叫小三，老爸当然叫老三
	}
}
