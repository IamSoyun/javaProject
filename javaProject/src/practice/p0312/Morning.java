package practice.p0312;

import java.util.Scanner;

public class Morning {
	public static void main(String[] args) {

		checkGender("0112234566788");
		checkGender("011223-4456678");
		
	}
	
	public static void checkGender(String j) {
		
		int gender;
		
		if(j.length() == 13) {
		
			int a = 2;
		
			if(j.charAt(6) == '4' || (int)j.charAt(6) == '2') {
				gender = 1;
			}else {
				gender = 2;
			}
			
		}else if (j.length() == 14) {
			
			if((int)j.charAt(7) == '2' || (int)j.charAt(7) == '4') {
				gender = 1;
			}else {
				gender = 2;
			}
			
		}else {
			gender = 0;
		}
		
		if(gender == 0) {
			System.out.println("잘못된 주민번호입니다.");
		}else if(gender == 1) {
			System.out.println("여자입니다.");
		}else if(gender == 2) {
			System.out.println("남자입니다");
		}
		
	}
	
}
