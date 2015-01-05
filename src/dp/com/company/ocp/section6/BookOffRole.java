package com.company.ocp.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class BookOffRole extends AbstractOffRole {
	private IBook book;
	
	public BookOffRole(IBook _book){
		this.book = _book;
	}
	
	@Override
	public int getOffPoint() {
		// TODO Auto-generated method stub
		return 0;
	}

}
