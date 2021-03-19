package Control;

public class WhileExample {
	public static void main(String[] args) {
		
//		int i = 1;
//		while(i <= 9) {
//			i++;
//			System.out.println(i);
//		}
		
//		int i = 0;
//		while(true) {
//			System.out.println(i);
//			if(i++ >= 5)
//				break;
//		}
		
		int sum = 0;
		int i = 1;
		
		while(i<=10) 
			sum+=i++;
		
		System.out.println(sum);
		
		
		sum = 0;
		i = 1;
		
		while(true) {
			sum +=i++;
			if(i==10)
				break;
			
		}
			
		
	}
}
