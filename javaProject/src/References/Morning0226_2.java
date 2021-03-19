package References;

public class Morning0226_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] engScores = new int[3];
		engScores = new int[] {90, 88, 97};
		engScores = new int[] {90, 88, 98};//이미 new를 만들었는데 왜 또 new 해줌?
		
		
//		int[] engScores = {90, 88, 97}; 
		

		int[] mathScores = new int[3];
		mathScores = new int[] {88, 90, 92}; 
		
		
		int[][] scores = new int[2][];
		scores[0] = new int[] {90, 88, 97};
		scores[1] = new int[] {88, 90, 92};

//		int[][] scores = {{90,88,97}},{88, 90, 92}};
				
		int sum = 0;
		
		for(int i = 0 ; i < scores.length ; i++) {
			for(int j = 0 ; j < scores[i].length ; j++) {
				sum += scores[i][j];
			}
			System.out.println("평균: " + (sum * 10 / scores[i].length ) / 10.0 );
//			System.out.printf("평균: %3.2f%n", (float) sum / scores[i].length);
			sum = 0;
		}
		
		

	}

}
