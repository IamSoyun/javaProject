package Control;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = (int) (Math.random() * 100 + 1);
			System.out.print(arr[i] + " ");
		}
		
		int temp = 0;
		
		for(int i = 0 ; i < arr.length-1 ; i++ ) {	
			
			for(int j = 0 ; j < arr.length-1-i ; j++ ) {
				
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
			
				}
		
			}
	
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		

	}

}
