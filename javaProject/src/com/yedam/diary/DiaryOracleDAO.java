package com.yedam.diary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiaryOracleDAO implements DAO {

	Connection conn;

	String user = "diary";
	String passwd = "diary";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";

	ResultSet rs = null;
	PreparedStatement psmt = null;
	String sql = null;
	String sql2 = null; //수정, 삭제에서 처리된 항목이 있는지 체크하는용
	int cnt = 0;

	List<DiaryVO> list;
	DiaryVO vo;

	public DiaryOracleDAO() { start(); }

	public void start() {
		conn = DButil.getConnection(url, user, passwd);
	}

	// 입력
	@Override
	public int insert(DiaryVO vo) {

		start();

		cnt = 0;
		psmt = null;
		sql = "INSERT INTO DiaryDB " + "VALUES ( TO_DATE(" + vo.getWdate() + ", 'YYMMDD'), '" + vo.getContents()
				+ "' )";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.executeQuery();
			System.out.println("입력 완료.");
			cnt++;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("입력 중 오류 발생.");

		} finally {
			DButil.close(null, psmt, conn);
		}

		return cnt;

	}

	// 수정
	@Override
	public void update(DiaryVO vo) {

		start();
		cnt = 0;

		psmt = null;
		rs = null;
		sql = "UPDATE DiaryDB " + "SET content = '" + vo.getContents() + "' " + "WHERE TO_CHAR(wdate,'YYMMDD') = '"
				+ vo.getWdate() + "'";
		sql2 = "SELECT COUNT(*) FROM DiaryDB WHERE TO_CHAR(wdate,'YYMMDD') = '" + vo.getWdate() + "'";

		try {
			psmt = conn.prepareStatement(sql2);
			rs = psmt.executeQuery();
			psmt = conn.prepareStatement(sql);
			psmt.executeQuery();

			if (rs.next() && rs.getInt("COUNT(*)") > 0) {
				cnt++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("수정 중 오류 발생.");

		} finally {
			DButil.close(null, psmt, conn);

			if (cnt == 0)
				System.out.println("해당 날짜의 일기가 없습니다.");
			else
				System.out.println(cnt + "건 수정 완료.");
		}

	}

	// 삭제
	@Override
	public int delete(String date) {

		start();
		cnt = 0;

		psmt = null;
		rs = null;
		sql = "DELETE FROM diaryDB " + "WHERE TO_CHAR(wdate,'YYMMDD') = '" + date + "'";
		sql2 = "SELECT COUNT(*) FROM diaryDB WHERE TO_CHAR(wdate,'YYMMDD') = '" + date + "'";

		try {
			psmt = conn.prepareStatement(sql2);
			rs = psmt.executeQuery();
			psmt = conn.prepareStatement(sql);
			psmt.executeQuery();

			if (rs.next() && rs.getInt("COUNT(*)") > 0) {
				cnt++;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("삭제 중 오류 발생.");

		} finally {
			DButil.close(null, psmt, conn);
		}

		return cnt;
	}

	// 날짜검색
	@Override
	public DiaryVO selectDate(String date) {

		start();
		vo = new DiaryVO();
		psmt = null;
		rs = null;
		sql = "SELECT TO_CHAR(wdate,'YYMMDD') AS wdate, content FROM diaryDB WHERE TO_CHAR(wdate,'YYMMDD') = '" + date
				+ "'";

		try {

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			if (rs.next()) {
				vo.setWdate(rs.getString("wdate"));
				vo.setContents(rs.getString("content"));
				return vo;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(null, psmt, conn);
		}

		return null;
	}

	// 내용검색
	@Override
	public List<DiaryVO> selectContent(String content) {

		list = new ArrayList<DiaryVO>();
		start();
		vo = null;
		psmt = null;
		rs = null;

		sql = "SELECT TO_CHAR(wdate,'YYMMDD') AS wdate, content FROM diaryDB WHERE content LIKE '%" + content
				+ "%' ORDER BY wdate DESC";

		try {

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String wdate = rs.getString("wdate");
				String contents = rs.getString("content");
				list.add(new DiaryVO(wdate, contents));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(null, psmt, conn);
		}

		return list;

	}

	// 전체조회
	@Override
	public List<DiaryVO> selectAll() {

		start();
		list = new ArrayList<DiaryVO>();
		psmt = null;
		rs = null;
		sql = "SELECT TO_CHAR(wdate,'YYMMDD') AS wdate, content " + "FROM diaryDB ORDER BY wdate DESC";

		try {

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String wdate = rs.getString("wdate");
				String content = rs.getString("content");
				list.add(new DiaryVO(wdate, content));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(null, psmt, conn);
		}

		return list;
	}

}
