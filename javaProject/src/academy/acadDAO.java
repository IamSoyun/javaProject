package academy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Hr.DBUtil;
import Hr.Department;

public class acadDAO {
Connection conn;
	
	acadDAO(){
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);
	}

	public Department[] deptList() {
		Department[] departments = new Department[100];
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM dept_java";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); 
			int i = 0;
			
			while(rs.next()) {
				
				Department dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setLocationId(rs.getInt("location_id"));
				dept.setManagerId(rs.getInt("manager_id"));
				
				departments[i++] = dept;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs,psmt,conn);
		}
		
		System.out.println("메소드 호출 완료.");		
		return departments;
	}
}
