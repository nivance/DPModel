package com.company.factorys.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractHumanFactory {

	public abstract <T extends Human> T createHuman(Class<T> c);
	
}