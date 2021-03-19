package Hr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class EmpDAO {
	
	Connection conn;
	
	public Set<Employee> getEmps(){
		
		String sql = "select * from emp_java";
		Set<Employee> set = new HashSet<Employee>();
		ResultSet rs = null;
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);	
			
			while(rs.next()){
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setDepartmentId(rs.getString("department_id"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJobId(rs.getString("job_id"));
				
				set.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		
		
		return set;
		
	}
	
	public EmpDAO(){
		
		String path = "config/database.propertise";
		FileReader fr = null;
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		try {
			prop.load(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("pass");
		
		conn = DBUtil.getConnection(url, user, passwd);
	}
	
	public List<Employee> getEmpList(){
		
		String sql = "SELECT * FROM emp_java";
		List<Employee> empList = new ArrayList<>();
		ResultSet rs = null;
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);	
			
			while(rs.next()){
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				empList.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		
		
		return empList;
		
	}
	
	
//	public Set<Employee> getEmps(){
//		
//		String sql = "SELECT * FROM emp_java";
//		Set<Employee> empList = new HashSet<>();
//		ResultSet rs = null;
//		Statement stmt = null;
//		
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);	
//			
//			while(rs.next()){
//				Employee emp = new Employee();
//				emp.setEmployeeId(rs.getInt("employee_id"));
//				emp.setFirstName(rs.getString("first_name"));
//				emp.setLastName(rs.getString("last_name"));
//				emp.setSalary(rs.getInt("salary"));
//				empList.add(emp);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.close(rs, stmt, conn);
//		}
//		
//		
//		return empList;
//		
//	}
	
	
//	public void setEmpList(Employee emp){
//		
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		String sql = "Insert Into emp_java values(" + emp.getEmployeeId() 
//		+ ", '" + emp.getLastName() + "', " + emp.;
//	}

	public Employee[] empList() {
		
		Employee[] employees = new Employee[100];
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM emp_java";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); 
			int i = 0;
			
			while(rs.next()) {
				
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
				
//				System.out.println(emp.toString());
				employees[i++] = emp;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs,psmt,conn);
		}
		
		System.out.println("메소드 호출 완료.");
		
		return employees;
	}
	
	
	
}
