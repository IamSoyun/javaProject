package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Board> boards = new ArrayList<>();
		
		boards.add(new Board("java", "very good", "user1"));
		boards.add(new Board("JAVA SCRIPT", "good", "user2"));
		boards.add(new Board("java script", "not bed", "user3"));
		
		System.out.print("과목 검색 > ");
		String searchStr = sc.nextLine();
		
		for(Board board : boards) {
			if(board.subject.toLowerCase().contains(searchStr.toLowerCase())) {
				System.out.println(board.toString());
			}
		}
		
	}

}
	
	
