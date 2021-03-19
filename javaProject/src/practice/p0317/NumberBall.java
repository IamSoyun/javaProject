package practice.p0317;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberBall {

	public static void main(String[] args) {
		
		int[] number = new int[3];
		boolean run = true;
		
		while(run) {
			for(int i = 0 ; i < number.length ; i++)
				number[i] = (int) (Math.random() * 9 + 1);
			
			Set set = new HashSet();
			for(int num : number)
				set.add(num);
			if(set.size() == number.length)
				run = false;
		}
		
		run = true;
		
		for(int i : number) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		int[] list = new int[number.length];
		
		while(run) {
			
			int ball = 0;
			int strike = 0;
			
			for(int i = 0 ; i < number.length ; i++ ) {
				System.out.print("숫자 입력 > ");
				list[i] = sc.nextInt(); sc.nextLine();
			}
			
			for(int i : list) {
				System.out.print("[" + i + "]");
			}
			
			for(int i = 0 ; i < list.length ; i++) {
				for(int j = 0 ; j < list.length ; j++) {
					if(i != j && list[i] == number[j])
						ball++;
				}
				
				if(list[i] == number[i])
					strike++;
				
			}
			
			if(strike == 3) {
				System.out.println(" - 정답!");
				run = false;
			}else if (ball+strike > 0 ) {
				System.out.println(" - " + ball +"B " + strike + "S");
			}else {
				System.out.println(" - OUT");
			}
		
			
		}
		

	}

}
