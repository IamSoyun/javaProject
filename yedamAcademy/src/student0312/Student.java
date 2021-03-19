package student0312;

public class Student {
	
	private String studentName;
	private int studentAge;
	private String studentPhone;
	
	public Student( String studentName, int studentAge, String studentPhone) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentPhone = studentPhone;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	
	@Override
	public String toString() {
		return studentName + "/" + studentAge + "/" + studentPhone;
	}
	
}
