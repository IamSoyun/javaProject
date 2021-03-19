package Control;

public class ForExample2 {
	public static void main(String[] args) {
		
		for(int i= 2 ; i <=9 ; i++) {
			MultiplicationTable(i);
		}
		
	}
	
	public static void MultiplicationTable(int stage) {

		for(int i = 1 ; i <= 9 ; i++) {
			int multi = stage * i;
			System.out.println(stage + " * " + i + " = " + multi);
		}
		
	}

}
