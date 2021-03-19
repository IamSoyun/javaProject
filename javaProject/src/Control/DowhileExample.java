package Control;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력: ");
		String str = sc.nextLine();
		System.out.println("값은: " + str);
		
		do {
			
			System.out.println(">");
			str = sc.nextLine();
			System.out.println(">>>" + str);
			
			
		}while(!str.equals("q"));
		
	}

}
