package academy;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AcaDAO {
		
	Connection conn;

	String user = "hr";
	String passwd = "hr";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	AcaDAO(){}
	
	public void start() {
		conn = DButil.getConnection(url, user, passwd);
	}
	
	public void insertStd(Student std) { // 학생 등록
		
		start();
		
		PreparedStatement psmt = null;
		String sql = "INSERT INTO student_info "
				+ "VALUES ("+ std.getStdId()
				+ ", '" + std.getStdName()
				+ "', " + std.getStdAge()
				+ ", '" + std.getStdPhone()
				+ "', " + std.getStdScore() +")";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.executeQuery();
			System.out.println("입력 완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("입력 중 오류 발생.");
			
		} finally {
			DButil.close(null, psmt, conn);
		}
		
		
		
	}
	
	public void updateStd(Student std) { // 학생 정보(연락처) 수정
		
		start();
		
		PreparedStatement psmt = null;
		String sql = "UPDATE student_info "
				+ "SET std_phone = '" + std.getStdPhone()
				+ "' WHERE std_id = " + std.getStdId();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.executeQuery();
			System.out.println("수정 완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("수정 중 오류 발생.");
			
		} finally {
			DButil.close(null, psmt, conn);
		}
		
	}
	
	public void insertScore() { // 성적 일괄 입력
		
		start();
		Scanner sc = new Scanner(System.in);
		
		PreparedStatement psmt = null;
		
		String sql = "SELECT std_id, std_name FROM student_info";
		ResultSet rs = null;
		ResultSet rs2 = null;

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.printf("%02d/%s > ", rs.getInt("std_id"), rs.getString("std_name"));
				int score = Integer.parseInt(sc.nextLine());
				
				sql = "UPDATE student_info "
						+ "SET std_score = '" + score
						+ "' WHERE std_id = " + rs.getInt("std_id");
				
				psmt = conn.prepareStatement(sql);
				psmt.executeQuery();
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("성적 입력 중 오류 발생.");
			
		} finally {
			DButil.close(null, psmt, conn);
		}
		

		
	}
	
	
	public void showScore(int id) { // 학생 1명 성적 조회
		
		start();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "SELECT std_id, std_name, std_score FROM student_info WHERE std_id = " + id;

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); 
			
			rs.next();
			System.out.printf("%02d/%s/%d\n", rs.getInt("std_id"), rs.getString("std_name"), rs.getInt("std_score"));
			System.out.println("호출 완료.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(rs, psmt, conn);
		}
		
	}

	
	
	public void updateScore(int id, int score) { // 성적 수정
		
		start();
		
		PreparedStatement psmt = null;
		String sql = "UPDATE student_info "
				+ "SET std_score = '" + score
				+ "' WHERE std_id = " + id;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.executeQuery();
			System.out.println("성적 수정 완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("성적 수정 중 오류 발생.");
			
		} finally {
			DButil.close(null, psmt, conn);
		}
		

	}
	
	public Student[] stdList() { // 학생 리스트 조회

		start();
		Student[] stdList = new Student[100]; // 리턴할 임시 배열
		PreparedStatement psmt = null;	// 실행 구문
		ResultSet rs = null;	// 실행 결과
		String sql = "SELECT * FROM student_info";

		try {
			psmt = conn.prepareStatement(sql); // 구문 저장
			rs = psmt.executeQuery(); // 구문 실행 > rs에 저장

			int i = 0;

			while (rs.next()) {

				Student std = new Student(rs.getInt("std_id"), rs.getString("std_name"), rs.getInt("std_age"),
						rs.getString("std_phone"), rs.getInt("std_score"));

				stdList[i++] = std;
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(rs, psmt, conn);
		}

		return stdList;
	}
	
	

}
