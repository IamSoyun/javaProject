package Objects;

public class CalExample {
	public static void main(String[] args) {
		
		Student2[] stds = new Student2[3];
		stds[0] = new Student2("박길동" , 77, 88);
		stds[1] = new Student2("최길동" , 63, 82);
		stds[2] = new Student2("이길동" , 56, 91);
		
	
	}
	
	public static int getSum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double getAvg(int a, int b) {
		return (a + b) / 2.0;
	}
	
	public static void showInfo(Student2 st) {
		System.out.print("이름: " + st.getName());
		System.out.print("합계점수: " + getSum(st.getEng(), st.getMath()));
		System.out.println("평균점수: " + getAvg(st.getEng(), st.getMath()));
		
	}
}
