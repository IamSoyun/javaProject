package Control;

public class Exercise6 {
	public static void main(String[] args) {
		
		int line = 6;
		exercise6_1(line);
		
	}
	
	public static void exercise6_1(int z) {
		
		for(int i = 0 ; i < z ; i++) {
			
			for(int j = 0 ; j <= i ; j++)
				System.out.print("*");
			
			System.out.println("");
		}
	}

}
