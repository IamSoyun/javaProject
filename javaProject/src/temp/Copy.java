package temp;

public class Copy {

	public static void main(String[] args) {
		
		int[] origin = {10,20,30,40};
		int[] copy = origin;
		int[] clone = origin.clone();
		
		origin[0] = 15;
		System.out.println(copy[0]);
		System.out.println(clone[0]);
		
		int[][] origin2 = {{10,20,30,40},{5,15,25,35}};
		int[][] copy2 = origin2;
		int[][] clone2 = new int[origin2.length][origin2[0].length];
		
		for(int i = 0 ; i < origin2[0].length ; i++)
			System.arraycopy(origin2[i], 0, clone2[i], 0, origin2[0].length);
		
		
		origin2[0][0] = 15;
		System.out.println(copy2[0][0]);
		System.out.println(clone2[0][0]);
		
		
		
	}
}
