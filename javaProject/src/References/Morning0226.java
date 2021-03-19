package References;

import java.util.Scanner;

public class Morning0226 {

	public static void main(String[] args) {
		
		gradeAvg();
		
	}
	
	public static void gradeAvg() {
		
		int[] engScores = new int[3];
		int[] mathScores = new int[3];
		int sum = 0;
		double engAvg = 0; 
		double mathAvg = 0;
		
		System.out.println("영어성적 입력:");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < engScores.length ; i++) {
			System.out.print("> ");
			engScores[i] = sc.nextInt();
			sum += engScores[i];
		}
		
		engAvg = (double) sum / engScores.length;
		
		sum = 0;
		System.out.println("수학성적 입력:");
		
		for(int i = 0 ; i < mathScores.length ; i++) {
			System.out.print("> ");
			mathScores[i] = sc.nextInt();
			sum += mathScores[i];
		}

		mathAvg = (double) sum / mathScores.length;
		
		System.out.println("영어평균: " + engAvg + " / 수학평균: " + mathAvg);
		
	}

}
