package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		
		
		int data = 0;
		FileReader fr = new FileReader("C:/Dev/git/cham/javaProject/src/javaFX/FileReaderExample.java");
		char[] readChar = new char[100];
		while((data = fr.read(readChar)) != -1) {
			System.out.print(new String(readChar));
		}
		fr.close();
		System.out.println("end");
	}
}
