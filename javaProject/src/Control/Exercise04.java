package Control;

public class Exercise04 {
	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		do {
			
			n1 = (int)(Math.random()*6+1);
			n2 = (int)(Math.random()*6+1);
			
		}while(n1+n2!=5);
		 
		System.out.print("("+n1+", "+n2+")");
	}
}
