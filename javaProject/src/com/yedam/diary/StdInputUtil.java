package com.yedam.diary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StdInputUtil {
									//리드를 쉽게하기 위해	//2바이트(char)로 처리	//입력받은거
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static SimpleDateFormat df = new SimpleDateFormat("yyMMdd");

	static int readInt() {
		int result = 0;

		do {
			try {
				String temp = br.readLine();
				result = Integer.parseInt(temp);
				break;
			} catch (Exception e) {
//			e.printStackTrace();
				System.out.println("숫자 형식이 아닙니다.");
				DiaryApp.menuPrint();
			}

		} while (true);

		return result;
	}

	public static String readDate() {
		String result = "";

		do {
			try {
				result = br.readLine();
				Date date = df.parse(result.trim());
				result = df.format(date);	//이상한날짜를 정날짜로 바꿔주기위한 과정
				break;
			} catch (Exception e) {
				System.out.println("날짜 형식이 아닙니다.");
			}
		} while (true);

		return result;
	}

	public static String readOneLine() {
		
		String result = null;
		
		try {
			result = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static String readMultiLine() {
		StringBuffer result = new StringBuffer();

		while (true) {
			String temp;
			try {
				temp = br.readLine();
				if (temp.equals("end")) {
					result.delete(result.length()-1, result.length());
					break;
				}
				result.append(temp + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return result.toString();
	}
}
