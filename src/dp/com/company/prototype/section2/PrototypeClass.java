package com.company.prototype.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class PrototypeClass  implements Cloneable{
	
	//覆写父类Object方法
	@Override
	public PrototypeClass clone(){
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			//异常处理
		}
		return prototypeClass;
	}
}
