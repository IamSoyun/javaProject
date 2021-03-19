package Objects;

public class Student1Example {
	
	public static void main(String[] args) {
		
		Student1[] students = new Student1[4];
		
		// Student1 student = new Student1(~~);
		students[0] = new Student1("홍길동", 90, 85);
		students[1] = new Student1("김길동", 88, 85);
		students[2] = new Student1("이길동", 76, 90);
		
		// Student1의 필드는 private 이기 때문에 s4.name = "박길동" 불가능
		Student1 s4 = new Student1();
		s4.setName("박길동");
		s4.setEng(-5);
		s4.setMath(95); 
		
		students[3] = s4;
		
		for(Student1 student : students) {
			student.showInfo();
		}
		
		
	}

}
