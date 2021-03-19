package Objects;

public class Student2Example {
	public static void main(String[] args) {
		
		Student2 s1 = new Student2("홍길동" , 20, 30);
		Student2 s2 = new Student2();
		s2.setName("김길동");
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		
		
	}

}
