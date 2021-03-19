package References;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		int[] ary = new int[10];
		int sum = 0;
		
		for(int i = 0 ; i < ary.length ; i++ ) {
			ary[i] = (int) ( Math.random() * 100 + 1 );
			sum += ary[i];
			System.out.print(ary[i] + " ");
		}
		
		double avg = 0;
		avg = (double) sum / ary.length;
		System.out.println(" 합: " + sum + " 평균: " + avg);
		
		int count = 0;
		int evensum = 0;
		
		System.out.println("-----------------------------------------------------");
		System.out.print("짝수는: ");
		
		for(int i = 0; i < ary.length ; i++ ) {
			if(ary[i]%2==0) {
				evensum += ary[i];
				System.out.print( ary[i]+ " " );
				count++;
			}
		}
		
		System.out.println("짝수의 합은: " + evensum + " 평균은: " + (double) evensum / count );
		
		
		
	}

}
