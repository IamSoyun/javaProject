package per;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 5.0;
		double y = 1.0;
		
		double z = x%y;
		
		if(y==0.0) {
			System.out.println("0으로 나눌수없음");
			
		}else {
			System.out.println("결과: " + (z + 10));
		}

	}

}
