package com.company.observer_mediator.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ProductManager {
	
	//是否可以创建一个产品
	private boolean isPermittedCreate = false;
	
	//建立一个产品
	public Product createProduct(String name){
		//首先修改权限，允许创建
		isPermittedCreate = true;
		Product p = new Product(this,name);
		return p;
	}
	
	//废弃一个产品
	public void abandonProduct(Product p){
		//销毁一个产品，例如删除数据库记录
		p = null;
	}
	
	//修改一个产品
	public void editProduct(Product p,String name){
		//修改后的产品
		p.setName(name);
	}
	
	//获得是否可以创建一个产品
	public boolean isCreateProduct(){
		return isPermittedCreate;
	}
	
	//克隆一个产品
	public Product clone(Product p){
		//产生克隆事件
		return p.clone();
	}
}