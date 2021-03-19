package Objects2;

import java.util.Scanner;

public class Member {
	
	private String memberId;
	private String memberName;
	private Books[] rentBooks = new Books[3];
	
	Scanner sc = new Scanner(System.in);
	
	
	public Member(String memberId, String memberName) { //회원가입(생성자)
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public String getMemberId() { // 아이디 겟
		return memberId;
	}

	public void rent() { //대출
		
		for(int i = 0 ; i < LibraryExe.bookList.length ; i++) {
			System.out.println(i+1 +". " + LibraryExe.bookList[i].getBookName());
		}
		
		System.out.print("대출할 책 번호 > ");
		int rentIndex = sc.nextInt() -1 ;
		
		for(int i = 0 ; i < rentBooks.length ; i++) {
			if(rentBooks[i] == null) {
				rentBooks[i] = LibraryExe.bookList[rentIndex];
				break;
			}
			if(i == rentBooks.length - 1)
				System.out.println("최대 3권까지 대출 가능합니다.");
		}
		
	}
	
	public void returnBack() { //반납
		
		for(int i = 0 ; i < rentBooks.length ; i++) {
			if(rentBooks[i] != null) {
				System.out.println(i+1 + ". " + rentBooks[i].getBookName());
			}
		}
		
		System.out.print("어느것을 반납하시겠습니까?(번호입력) > ");
		int answer = sc.nextInt() -1 ;
		sc.nextLine();
		
		rentBooks[answer] = null;
		
	}
	
	public void showRent() { //대출목록
		
		System.out.println("~대출목록~");
		for(int i = 0 ; i < rentBooks.length ; i++) {
			if(rentBooks[i] != null)
				System.out.println(i+1 + ". " + rentBooks[i].getBookName());
			
		}
		
	}
	
	public static int findMemIndex() { // 아이디찾기
		
		Scanner sc = new Scanner(System.in);
		
		int memIndex = 0;
		System.out.print("아이디를 입력하세요 > ");
		String id = sc.nextLine();
		
		for(int i = 0 ; i < LibraryExe.member.length ; i++) {
			if(id.equals(LibraryExe.member[i].getMemberId())) {
				memIndex = i;
				break;
			}
		}
		
		return memIndex;
	
	}



}
