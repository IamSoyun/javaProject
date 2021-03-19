package Objects2;

import java.util.Scanner;

public class BookManager {
	
	static int count;
	
	public BookManager(){
		this.count = 1;
	}

	public Books bookManage() {

		String bookName = null;
		String bookWriter = null;
		String bookPublisher = null;
		int bookPrice = 0;
		

		Scanner sc = new Scanner(System.in);

		System.out.print(count++ + ". 도서 제목 > ");
		bookName = sc.nextLine();

		System.out.print("작가 > ");
		bookWriter = sc.nextLine();

		System.out.print("출판사 > ");
		bookPublisher = sc.nextLine();

		System.out.print("가격 > ");
		bookPrice = sc.nextInt();
		sc.nextLine();

		return new Books(bookName, bookWriter, bookPublisher, bookPrice);
	}

}
