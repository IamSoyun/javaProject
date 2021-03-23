package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class InputDAO {
	
	static Connection con = null;

	Connection conn = null;

	String user = "hr";
	String passwd = "hr";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public InputDAO(){}
	
	public void start() {
		conn = DButil.getConnection();
	}

	
	//보드리스트
	public static ObservableList<BoardVO> boardList(){ 
		
		String sql = "SELECT * FROM input_board ORDER BY board_no";
		Statement stmt = null;
		ResultSet rs = null;
		ObservableList<BoardVO> boardList = FXCollections.observableArrayList();
		
		con = DButil.getConnection();
		
		try {
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
			BoardVO vo = new BoardVO();
			vo.setBoardNo(rs.getInt("board_no"));
			vo.setTitle(rs.getString("title"));
			vo.setContents(rs.getString("content"));
			vo.setExitDate(rs.getString("exit_date"));
			vo.setPasswd(rs.getString("passwd"));
			vo.setPublicity(rs.getString("publicity"));
			
			boardList.add(vo);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오류 발생.");
		} finally {
			DButil.close(rs, stmt, con);
		}
		
		
		return boardList;
	
	} //리스트
		
	
	//인설트
	public void insertBo(InputBoardVO bo) {
		
		start();
		
		PreparedStatement psmt = null;
		String sql = "INSERT INTO input_board "
				+ "VALUES ( (select nvl(max(board_no),0) +1 from input_board) "
				+ ", '" + bo.getTitle()
				+ "', '" + bo.getPasswd()
				+ "', '" + bo.getPublicity()
				+ "', '" + bo.getExitDate()
				+ "', '" + bo.getContents() +"')";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.executeUpdate();
			System.out.println("입력 완료.");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("입력 중 오류 발생.");
			
		} finally {
			DButil.close(null, psmt, conn);
		}
		
		
		
	}	//인설트
	
	
	//업데이트
	public static void updateBo(BoardVO vo) {
		
		con = DButil.getConnection();
		PreparedStatement stmt = null;
		
		String sql = " UPDATE input_board "
					+ " SET content = ?, " 
					+ " 	exit_date = ?, " 
					+ " 	publicity = ?, " 
					+ "		title = ? "
					+ " WHERE board_no = ?"; 
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, vo.getContents());
			stmt.setString(2, vo.getExitDate());
			stmt.setString(3, vo.getPublicity());
			stmt.setString(4, vo.getTitle());
			stmt.setInt(5, vo.getBoardNo());
			int r = stmt.executeUpdate();
			
			System.out.println(r + "건 수정 완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("수정 중 오류 발생.");
			
		} finally {
			DButil.close(null, stmt, con);
		}
		
	} //업데이트
	
	
	//삭제
	public static void deleteBo(BoardVO vo) {
		
		con = DButil.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "DELETE FROM input_board "
					+ "WHERE board_no = ?"; 
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, vo.getBoardNo());
			int r = stmt.executeUpdate();
			
			System.out.println(r + "건 삭제 완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("삭제 중 오류 발생.");
			
		} finally {
			DButil.close(null, stmt, con);
		}
		
	}
	
	
//	
//	
//	public void showScore(int id) { 
//		
//		start();
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		String sql = "SELECT std_id, std_name, std_score FROM student_info WHERE std_id = " + id;
//
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery(); 
//			
//			rs.next();
//			System.out.printf("%02d/%s/%d\n", rs.getInt("std_id"), rs.getString("std_name"), rs.getInt("std_score"));
//			System.out.println("호출 완료.");
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DButil.close(rs, psmt, conn);
//		}
//		
//	}
//
//	
//	public InputBoardVO[] boardList() { 
//
//		start();
//		InputBoardVO[] boardList = new InputBoardVO[100]; // 리턴할 임시 배열
//		PreparedStatement psmt = null;	// 실행 구문
//		ResultSet rs = null;	// 실행 결과
//		String sql = "SELECT * FROM input_board";
//
//		try {
//			psmt = conn.prepareStatement(sql); // 구문 저장
//			rs = psmt.executeQuery(); // 구문 실행 > rs에 저장
//
//			int i = 0;
//
//			while (rs.next()) {
//
//				InputBoardVO bo = new InputBoardVO(rs.getInt("board_no"), rs.getString("title")
//						, rs.getString("passwd"), rs.getString("publicity"), rs.getNString("exit_date")
//						, rs.getString("content"));
//
//				boardList[i++] = bo;
//			}
//			
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DButil.close(rs, psmt, conn);
//		}
//
//		return boardList;
//	}
	

}
