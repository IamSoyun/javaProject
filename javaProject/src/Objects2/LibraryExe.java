package Objects2;

import java.util.Scanner;

public class LibraryExe {

	static Member[] member = new Member[1];
	static Books[] bookList = new Books[10];

	public static void main(String[] args) {

		int count = 0;
		boolean run = true;

		Scanner sc = new Scanner(System.in);

		while (run) {

			System.out.println("==============================================================");
			System.out.println("1.도서입력 | 2.회원가입 | 3. 대출(도서목록) | 4. 대출목록 | 5. 반납 | 6. 종료");
			System.out.println("==============================================================");
			System.out.print("선택 > ");

			int answer = sc.nextInt();
			sc.nextLine();

			if (answer == 1) { // 도서입력 (나중에 도서분할입력, 도서삭제, 입력했을때 빈공간에 넣기 기능 만들기)

				BookManager bookmanage = new BookManager();
				
				for (int i = 0; i < bookList.length; i++) {
					bookList[i] = bookmanage.bookManage();
				}

			} else if (answer == 2) { // 회원가입 member[count] = Member(id, name);

				System.out.print("아이디 > ");
				String id = sc.nextLine();
				System.out.print("이름 > ");
				String name = sc.nextLine();

				member[count++] = new Member(id, name);

			} else if (answer == 3) { // 대출 Member[memIndex].rent()

				member[Member.findMemIndex()].rent();

			} else if (answer == 4) { // 대출목록

				member[Member.findMemIndex()].showRent();

			} else if (answer == 5) { // 반납

				member[Member.findMemIndex()].returnBack();

			} else if (answer == 6) {
				System.out.println("프로그램 종료.");
				run = false;
			}

		}

	}
}
