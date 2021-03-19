package Exceptions.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrywithResourceExample {
	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("list.txt");
			int readByte = -1;
			while ((readByte = fis.read()) != -1) {
				System.out.println(readByte);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} 

	}
}
