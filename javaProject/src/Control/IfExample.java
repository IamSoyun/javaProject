package Control;

public class IfExample {
	public static void main(String[] args) {
		
		int score = 85;
		String  grade = "F";
		
		if(score>=90) {
			if(score>=95)
				grade = "A+";
			else grade = "A";
		} else if(score>=80) {
			if(score>=85)
				grade = "B+";
			else grade = "B";
		}else if(score>=70) {
			if(score>=75)
				grade = "C+";
			else grade = "C";
		}
			
		
		
//		grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "F";
		
		System.out.println(grade);

	}
}
