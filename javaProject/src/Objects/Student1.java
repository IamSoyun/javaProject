package Objects;

public class Student1 {
	
	private String name; //private 필드 > 직접 변경은 불가능, 생성자 혹은 메소드를 통해서만 변경 가능
	private int eng;
	private int math;
	
	Student1(){}
	
	Student1(String name, int eng, int math){
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	
	void showInfo() {
		
		int sum = eng + math;
		System.out.println("이름: " + name + ", 영어: " + eng + ", 수학: " + math + ", 합계: " + sum);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEng(int eng) {
		if(eng >= 0)
			this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}

}
