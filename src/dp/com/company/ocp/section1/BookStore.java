package com.company.ocp.section1;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 书店销售书籍
 */
public class BookStore {
	private final static ArrayList<IBook> bookList = new ArrayList<IBook>();
	
	//静态模块初始化，项目中一般是从持久层初始化产生
	static{
		bookList.add(new NovelBook("天龙八部",3200,"金庸"));
		bookList.add(new NovelBook("巴黎圣母院",5600,"雨果"));
		bookList.add(new NovelBook("悲惨世界",3500,"雨果"));
		bookList.add(new NovelBook("金瓶梅",4300,"兰陵笑笑生"));
	}
	
	//模拟书店买书
	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		formatter.setMaximumFractionDigits(2);
		System.out.println("------------书店买出去的书籍记录如下：---------------------");
		for(IBook book:bookList){
			System.out.println("书籍名称：" + book.getName()+"\t书籍作者：" + book.getAuthor()+ "\t书籍价格：" + formatter.format(book.getPrice()/100.0)+"元");
		}
	}
}
