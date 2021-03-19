package collections.exercise;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;			
			return this.hashCode() == std.hashCode();
		}else {
			return false;
		}
		
	}

}
