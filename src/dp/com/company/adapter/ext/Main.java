package com.company.adapter.ext;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 我们都知道IO流有字符和字节流，那怎样把字节流转换成字符流来使用的呢？这其中就是要使用到适配器类了，如图：
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/test.text");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while (line != null && !line.equals("")) {
			System.out.println(line);
		}
		br.close();

	}
}
