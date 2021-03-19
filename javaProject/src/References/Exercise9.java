package References;

 

import java.util.Scanner;


public class Exercise9 {

	public static void main(String[] args) {

 

		boolean run = true;

		int studentNum = 0; 

		int[][] scores = null;

 

		Scanner sc = new Scanner(System.in);

 

		while (run) {

 

			System.out.println("----------------------------------------------------------------");

			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7.수학평균점이상 8.종료");

			System.out.println("----------------------------------------------------------------");

			System.out.print("선택 > ");

 

			int answer = sc.nextInt();

 

			if (answer == 1) { // 학생수 입력

				if (studentNum != 0) {

					System.out.println("이미 입력했습니다.");

					continue;

				}

				System.out.print("학생수 > ");

				studentNum = sc.nextInt();

				scores = new int[studentNum][3];// 번호, 영어, 수학

			}

 

			if (studentNum == 0) {

				System.out.println("학생 수 부터 입력하세요.");

				continue;

			}

 

			if (answer == 2) { // 번호, 점수 입력

 

				if (scores[0][0] != 0) {

					System.out.println("이미 입력했습니다.");

					continue;

				}

 

				for (int i = 0; i < scores.length; i++) {

 

					System.out.print("학생번호: ");

					scores[i][0] = sc.nextInt();

					

					System.out.print("영어점수: ");

					scores[i][1] = sc.nextInt();

 

					System.out.print("수학점수: ");

					scores[i][2] = sc.nextInt();

					

 

					System.out.println();

				}

 

			} else if (answer == 3) { // 전체 리스트

 

 

 

				for (int i = 0; i < scores.length; i++) {

					

					System.out.println(i+1 + ". 번호: " + scores[i][0] + ", 영어: " +  scores[i][1]

							+ ", 수학: " + scores[i][2]);

					

				}

 

			} else if (answer == 4) { // 조회

 

				int temp;

 

				System.out.print("조회할 학생 번호입력 > ");

				int find = sc.nextInt();

 

				for (int i = 0; i < scores.length; i++) {

					if (scores[i][0] == find) {

						

						System.out.println("번호: " + scores[i][0] 

								+ ", 영어: " +  scores[i][1] 

										+ ", 수학: " + scores[i][2]);

					}

				}

 

			} else if (answer == 5) { // 영어 최고점

 

				int max = 0;

				int temp = 0;

 

				for (int i = 0; i < scores.length; i++) {

					if (scores[i][1] >= max) {

						max = scores[i][1];

						temp = i;

					}

				}

 

				System.out.println("영어최고점 - 번호: " + scores[temp][0] 

						+ ", 영어: " +  scores[temp][1]);

 

 

			} else if (answer == 6) { // 수석

 

				int sum = 0;

				int max = 0;

				int top = 0;

 

				for (int i = 0; i < scores.length; i++) {

 

					for (int j = 1; j < scores[i].length; j++) {

						sum += scores[i][j];

					}

 

					if (sum >= max) {

						max = sum;

						top = i;

					}

 

					sum = 0;

 

				}

 

				System.out.println("번호: " + scores[top][0] 

						+ ", 평균점수: " + (double) max / 2);

				

				

			} else if (answer == 7) { // 수학평균이상학생

 

				int sum = 0;

				double avg = 0;

 

				for (int i = 0; i < scores.length; i++) {

					sum += scores[i][2];

				}

 

				avg = (double) sum / studentNum;

				int count = 1;

				

				System.out.println("평균점수: " + (int) (avg * 100) / 100.0);

 

				for (int i = 0; i < scores.length; i++) {

					

					if (scores[i][2] >= avg) {

						

						System.out.println(count++ + ". 번호: " + scores[i][0] 

								+ ", 수학: " + scores[i][2]);

 

					}

				}

 

			} else if (answer == 8) { // 종료

				run = false;

				System.out.println("프로그램 종료.");

 

			} else if (answer != 1) { // 이상한거 입력

				System.out.println("1~8중에 입력하세요.");

			}

 

		}

 

	}

}