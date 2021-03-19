package Control;

public class today210225 {

	public static void main(String[] args) {
		
		int x = 67;
		int y = 44;
		
		System.out.println(getSumValue(y, x)); 
		

	}
	
	public static int getSumValue(int x , int y) {
		
		int sum = 0;
		
		if(x<=y) {
			for( ; x<=y ; x++) {
				sum += x;
			}
		}else
			for( ; y<=x ; y++) {
				sum += y;
			}
		
		return sum;
	}

}
