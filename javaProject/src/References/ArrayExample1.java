package References;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ary = new int[5];
		
		for(int i = 0 ; i < ary.length ; i++) {
			ary[i] = (int) (Math.random()*10 + 1);
			System.out.print(ary[i] + " ");
		}
		
		int maxValue=0;
		
		for(int i = 0 ; i < ary.length ; i++) {
			if(ary[i]>maxValue)
				maxValue = ary[i];
		}
		
		System.out.println("max: " + maxValue);

	}

}
