/**
 * 
 */
package com.company.singleton.section1;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 大臣是天天要面见皇帝，今天见的皇帝和昨天的，前天不一样那就出问题了！
 */
@SuppressWarnings("all")
public class Minister {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int day = 0; day < 3; day++) {
			Emperor emperor = Emperor.getInstance();
			emperor.say();
		}
		// 三天见的皇帝都是同一个人，荣幸吧！
	}

}
