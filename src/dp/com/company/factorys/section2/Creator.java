package com.company.factorys.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Creator {
	
	/*
	 * 创建一个产品对象,其输入参数类型可以自行设置
	 * 通常为String、Enum、Class等，当然也可以为空
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
