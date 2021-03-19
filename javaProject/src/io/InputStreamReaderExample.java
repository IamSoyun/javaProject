package io;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedInputStream bis = new BufferedInputStream(is);
		
		int data = 0;
		char[] charBuf = new char[100];
		while((data = isr.read(charBuf)) != -1) {
			String str = new String(charBuf);
			System.out.println(str);
		}
		
		isr.close();
		is.close();
	}
}
