package com.company.flyweight.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Flyweight {
	//内部状态
	private String intrinsic;
	//外部状态
	protected final String Extrinsic;
	//要求享元角色必须接受外部状态
	public Flyweight(String _Extrinsic){
		this.Extrinsic = _Extrinsic;
	}
	
	//定义业务操作
	public abstract void operate();
	
	//内部状态的getter/setter
	public String getIntrinsic() {
		return intrinsic;
	}
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}	

}
