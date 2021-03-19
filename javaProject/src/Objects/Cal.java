package Objects;

public class Cal {
	
	public static void main(String[] args) {
		
		Student2 s1 = new Student2();
		s1.setName("김길동");
		s1.setEng(90);
		s1.setMath(80);
		showInfo(s1);
		
		Student2[] stds = new Student2[3]; //클래스형태의 배열
		stds[0] = new Student2("박길동" , 77, 88);
		stds[1] = new Student2("최길동" , 63, 82);
		stds[2] = new Student2("이길동" , 56, 91);
		
		showInfo(stds);
		
	}
	
	//출력 메소드
	public static void showInfo(Student2 student) { //외부 클래스를 매개변수로
		System.out.println(student.getName() + "님 안녕하세요.");
		System.out.println("당신의 영어점수는: " + student.getEng() 
				+ ", 수학점수는: " + student.getMath() 
				+ ", 평균점수는: " + (student.getEng() + student.getMath()) / 2.0 );
	} //필드는 다 private라 get으로 들고옴
	
	
	// 배열받아서 출력 메소드를 호출하는 메소드
	public static void showInfo(Student2[] students) { //클래스형태 배열을 매개변수로
		for(Student2 student : students) {
			showInfo(student); //메소드안에서 메소드 호출
		}
	}

}
