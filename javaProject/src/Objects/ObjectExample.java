package Objects;

public class ObjectExample {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.studentNo = "s12345";
		student.grade = 2;
		student.eng = 80;
		student.math = 85;
		student.study();
		student.run();
		student.introduce();
		

		Student student1 = new Student("1234");
//		student1.studentNo = "s12345";
		student1.grade = 3;
		student1.eng = 76;
		student1.math = 88;
		student1.study();
		student1.run();
		student1.introduce();
		
		Student student2 = new Student(5,40,30);
		student2.studentNo ="s23459";
		student2.study();
		student2.run();
		student2.introduce();
		
	}

}
