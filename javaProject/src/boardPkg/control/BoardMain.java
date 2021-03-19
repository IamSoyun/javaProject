package boardPkg.control;

import java.util.Calendar;
import java.util.Scanner;

import boardPkg.model.Board;
import boardPkg.model.Service;
import boardPkg.model.impl.ServiceImpl;
import boardPkg.control.BoardDAO;

public class BoardMain {
	public static void main(String[] args) {
		
		Service service = new ServiceImpl();	
		Board[] list = service.getBoardList(); // 글목록
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int an;
		
		while(run) {
			
			System.out.println("---------------------------------");
			System.out.println("1.작성 2.수정 3.삭제 4.목록 5.검색 9.종료");
			System.out.println("----------------------------------");
			System.out.print("선택 > ");
			
			an = Integer.parseInt(sc.nextLine());
			
			if(an == 1) {
					
				System.out.print("글번호 > ");
				int boardNo = Integer.parseInt(sc.nextLine());
				System.out.print("작성자 > ");
				String writer = sc.nextLine();
				System.out.print("제목 > ");
				String title = sc.nextLine();
				System.out.print("내용 > ");
				String content = sc.nextLine();
				
				Board brd = new Board(boardNo, title, content, writer, null);
				service.createBoard(brd);
				
				
			} else if (an == 2) {
				
				System.out.print("수정할 글 번호 > ");
				int selectMod = Integer.parseInt(sc.nextLine());
				
				System.out.print("글 내용 입력 > ");
				String contentMod = sc.nextLine();
				
				Board board = new Board(selectMod, null, contentMod, null, null);
				service.modifyBoard(board);
				
				
			} else if (an == 3) {
				
				System.out.print("삭제할 글 번호 > ");
				int selectDel = Integer.parseInt(sc.nextLine());
				
				Board board = new Board(selectDel, null, null, null, null);
				service.removeBoard(board);
				
				
			} else if (an == 4) {
				
				list = service.getBoardList();
				
				for(Board board : list) {
					if(board == null)
						break;
					System.out.println(board.toString());
				}
				
				
			} else if (an == 5) {
				
				System.out.print("조회할 글 번호 > ");
				int selectShow = Integer.parseInt(sc.nextLine());
				
				if(service.getBoard(selectShow) != null)
					System.out.println(service.getBoard(selectShow).toString());
				
			} else if (an == 9) {
				run = false;
				
			} 
			
		}
		
	}
}
