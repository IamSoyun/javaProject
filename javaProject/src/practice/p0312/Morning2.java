package practice.p0312;

public class Morning2 {
	public static void main(String[] args) {
		
		sum("10000","23400"); //33,400
	}
	
	public static void sum(String a, String b) {
		
		String sum = Integer.parseInt(a) + Integer.parseInt(b) + "";
		String[] sums = new String[sum.length()/3 + 1];
		
		for(int i = 0 ; i < sum.length() / 3 + 1 ; i++) {
			
			
			int end = sum.length() - (3*i);
			int start = end - 3;
			
			while(start < 0) {
				start++;
			}
			while(end > sum.length()) {
				end--;
			}
			
			sums[i] = sum.substring(start, end);
			System.out.println(sums[i]);
		}
		
		sum = "";
		
		for(int i = 0 ; i < sums.length ; i++ ) {
			if(1 == sums.length - 1) {
				sum = sums[i] + sum;
				break;
			}
			
			sum = "," + sums[i] + sum;
		}
		
		
		System.out.println(sum);
		
	}

	private static Object start(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
