package Control;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 70;
		String grade = "F";
		
		switch(score / 10) {
			case 10 : case 9 :
				grade = "A";
				break;
				
			case 8 :
				grade = "B";
				break;
				
			case 7 :
				grade = "C";
				break;
				
			default :
				break;
		}
		
		System.out.println(grade);
		
		
		
		
	

	}

}
