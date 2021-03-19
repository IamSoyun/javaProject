package collections;

public class Student {
	
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
		
	}
	
	@Override
	public int hashCode() {
		return this.sno + this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return this.sno == s.sno && this.name.equals(s.name);
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	

}
