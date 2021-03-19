package Control;

import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int answer;
		int account = 0;
		
		while(run) {
			
			System.out.println("");
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료 ");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			answer = sc.nextInt();
			
			switch(answer) {
			
			case 1 :
				System.out.print("예금액 > ");
				account+=sc.nextInt();
				break;
				
			case 2 :
				System.out.print("출금액 > ");
				account-=sc.nextInt();
				break;
				
			case 3 :
				System.out.println("잔고 > " + account);
				break;
				
			case 4 :
				System.out.println("프로그램 종료.");
				run = false;
				break;
				
			default:
				System.out.println("1~4중에 입력하세요.");
					
				
			}
			
		}
		
		
	}

}
