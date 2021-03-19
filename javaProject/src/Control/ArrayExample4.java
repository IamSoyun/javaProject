package Control;

import java.util.Scanner;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = (int) (Math.random()*100+1);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇번째 값? (1~10)");
		System.out.println();
		

	}

}
