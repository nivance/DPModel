package com.company.flyweight.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteFlyweight1 extends Flyweight{
	
	//接受外部状态
	public ConcreteFlyweight1(String _Extrinsic){
		super(_Extrinsic);
	}
	
	//根据外部状态进行逻辑处理
	public void operate(){
		//业务逻辑
	}


}
