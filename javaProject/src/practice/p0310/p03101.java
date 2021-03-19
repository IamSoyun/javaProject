package practice.p0310;

public class p03101 {
	public static void main(String[] args) {
		
		int[][] ary = new int[5][5];
		
		int num = 1;
		for(int i = 0 ; i < ary.length ; i++) {
			for(int j = 0 ; j < ary[0].length ; j++ ) {
				ary[i][j] = num++;
			}
		}
		
		for(int i = 0 ; i < ary.length ; i++) {
			for(int j = 0 ; j < ary[0].length ; j++ ) {
				System.out.printf(" %2d",ary[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0 ; i < ary.length ; i++) {
			for(int j = 0 ; j < ary[0].length ; j++) {
				System.out.printf(" %2d",ary[j][i]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0 ; i < ary.length ; i++) {
			for(int j = ary[0].length -1 ; j >= 0 ; j--) {
				System.out.printf(" %2d",ary[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = ary.length -1 ; i >= 0 ; i--) {
			for(int j = 0 ; j < ary[0].length ; j++) {
				System.out.printf(" %2d",ary[i][j]);
			}
			System.out.println();
		}
		
	}

}
