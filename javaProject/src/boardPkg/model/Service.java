package boardPkg.model;

public interface Service {
	
	public Board[] getBoardList();	//전체목록
	public Board getBoard(int boardNo);	//한건조회
	public void createBoard(Board board); //게시글작성
	public void modifyBoard(Board board); //글수정
	public void removeBoard(Board board); //글삭제
	
//	service를 인터페이스로 만들고 serviceImpl 이라는 구현 객체를 따로 만드는 이유
//	interface 라는 기본 규칙을 두고 기능을 조정하기위해...(?) 

}
