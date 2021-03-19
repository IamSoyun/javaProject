package boardPkg.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import boardPkg.common.DBcon;
import boardPkg.model.Board;

public class BoardDAO {

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 목록
	public Board[] selectBoards() {

		sql = "SELECT * FROM board ORDER BY board_no DESC";
		conn = DBcon.getConnection();
		Board[] boards = new Board[100];
		int i = 0;

		try {

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				Board brd = new Board();
				brd.setBoardNo(rs.getInt("board_no"));
				brd.setTitle(rs.getString("title"));
				brd.setContent(rs.getString("content"));
				brd.setWriter(rs.getNString("writer"));
				brd.setCreationDate(rs.getString("creation_date"));

				boards[i++] = brd;
			}

		} catch (SQLException e) {
			System.out.println("조회처리 중에 에러가 발생했습니다.");

		} finally {
			// 정상실행/예외발생과 관련없이 항상 실행해야할 구문
			close();
		}

		i = 0;
		return boards;

	}

	//검색
	public Board selectBoard(int boardNo) {

		Board brd = null;

		sql = "SELECT * FROM board WHERE board_no = " + boardNo;
		conn = DBcon.getConnection();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				brd = new Board(rs.getInt("board_no"), rs.getString("title"), rs.getString("content"),
						rs.getString("writer"),rs.getString("creation_date"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return brd;
	}

	// 글 작성
	public void insertBoard(Board board) {

		conn = DBcon.getConnection();
		sql = "INSERT INTO board " + "VALUES (" + board.getBoardNo() + ", '" + board.getTitle() + "', '"
				+ board.getContent() + "', '" + board.getWriter() + "', SYSDATE)";

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			close();
		}
		

	}

	// 수정
	public void updateBoard(Board board) {

		conn = DBcon.getConnection();
		sql = "UPDATE board " + "SET content = '" + board.getContent() + "'"
				 + "WHERE board_no = " + board.getBoardNo();

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 수정되었습니다.");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			close();
		}

	}

	// 삭제
	public void deleteBoard(Board board) {

		conn = DBcon.getConnection();
		sql = "DELETE FROM board " + "WHERE board_no = " + board.getBoardNo();

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			close();
		}

	}

}
