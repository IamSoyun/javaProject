package operators;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {  // e는 왜들어감? , catch 두개는 안됨?
			System.out.println("오버플로우 발생으로 계산불가 " + e.getMessage());
		} 
		
		System.out.println("정상종료");

	}
	
	public static int safeAdd(int left, int right) {
		if(right>0) {
			if(left>Integer.MAX_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if(left<Integer.MIN_VALUE - right) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		
		return left + right;
		
		
	}
}
