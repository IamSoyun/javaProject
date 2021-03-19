package References;

public class ArrayExample {
	public static void main(String[] args) {
		
		int[] scores = new int[5];
		
		scores[0] = 90;
		scores[1] = 91;
		scores[2] = 92;
		scores[3] = 93;
		scores[4] = 94;
		
		int[] scores2 = {90,91,92,93,94};
		int sum = 0;
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
			
		}
		
		double avg = sum / scores.length;
		System.out.println( sum +" " + avg );
		
		
	
	}
}
