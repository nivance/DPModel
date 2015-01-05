package com.company.command_chain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	public static void main(String[] args) throws IOException {
		Invoker invoker = new Invoker();
		while(true){
			//unix写的默认提示符号
			System.out.print("#");
			//捕获输出
			String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			//输入quit或exit则退出
			if(input.equals("quit") || input.equals("exit")){
				return;
			}
			System.out.println(invoker.exec(input));
		}
	
	}

}
