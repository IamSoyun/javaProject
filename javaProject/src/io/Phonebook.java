package io;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Phonebook {
	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		BufferedInputStream bis = new BufferedInputStream(is);
		InputStreamReader isr = new InputStreamReader(bis);

		FileOutputStream fos = new FileOutputStream("C:/Temp/Phonebook.txt");
		Writer writer;
		
		boolean run = true;

		while (run) {
			
			writer = new OutputStreamWriter(fos);
			
			int number;
			
			System.out.print("이름 > ");
			char[] charBuf = new char[100];
			number = isr.read(charBuf);
			String strName = new String(charBuf, 0, number - 2);
			
			System.out.print("번호 > ");
			charBuf = new char[100];
			number = isr.read(charBuf);
			String strPhone = new String(charBuf, 0, number - 2);
			
			writer.write(strName + " " + strPhone);
			
			writer.flush();
			writer.close();
			System.out.println("연락처 저장이 끝났습니다.");

		}

	}
}
