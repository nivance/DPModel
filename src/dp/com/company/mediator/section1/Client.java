package com.company.mediator.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 业务场景类
 */
public class Client {
	
	public static void main(String[] args) {
		//采购人员采购电脑
		System.out.println("------采购人员采购电脑--------");
		Purchase purchase = new Purchase();
		purchase.buyIBMcomputer(100);
		
		//销售人员销售电脑
		System.out.println("\n------销售人员销售电脑--------");
		Sale sale = new Sale();
		sale.sellIBMComputer(1);
		
		//库房管理人员管理库存
		System.out.println("\n------库房管理人员清库处理--------");
		Stock stock = new Stock();
		stock.clearStock();
	}

}
