package com.company.facade.section2;

import com.company.facade.section1.ILetterProcess;
import com.company.facade.section1.LetterProcessImpl;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ModenPostOffice {
	private ILetterProcess letterProcess = new LetterProcessImpl();
	
	//写信，封装，投递，一体化了
	public void sendLetter(String context,String address){
		
		//帮你写信
		letterProcess.writeContext(context);
		
		//写好信封
		letterProcess.fillEnvelope(address);
		
		//把信放到信封中
		letterProcess.letterInotoEnvelope();
			
		//邮递信件
		letterProcess.sendLetter();
		
	}
}
