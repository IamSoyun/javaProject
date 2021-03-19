package References;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {

		boolean run = true;
		int studentsNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {

			System.out.println("------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");

			int answer = sc.nextInt();

			if (answer == 1) {

				System.out.print("학생수 > ");
				studentsNum = sc.nextInt();
				scores = new int[studentsNum];

			} else if (answer == 2) {

				if (studentsNum != 0) {
					for (int i = 0; i < studentsNum; i++) {
						System.out.print(i + 1 + "번 학생 점수 > ");
						scores[i] = sc.nextInt();
					}
					System.out.println();
				}

			} else if (answer == 3) {

				if (studentsNum != 0) {
					for (int i = 0; i < scores.length; i++) {
						System.out.println(i + 1 + "번 학생: " + scores[i]);
					}
				}

			} else if (answer == 4) {

				if (studentsNum != 0) {

					int sum = 0;
					int max = 0;
					double avg = 0;

					for (int i = 0; i < scores.length; i++) {
						sum += scores[i];
						if (scores[i] > max)
							max = scores[i];
					}

					avg = (double) sum / scores.length;

					System.out.println("최고 점수: " + max);
					System.out.println("평균 점수: " + avg);

				}

			} else if (answer == 5) {

				System.out.println("프로그램 종료.");
				run = false;

			} else {

				System.out.println("1~5번중에 골라주세요");
			}

		} // while

	}

}
