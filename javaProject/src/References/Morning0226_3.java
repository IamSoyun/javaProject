package References;

public class Morning0226_3 {

	public static void main(String[] args) {
		
		arrayCopy();
	
	}
	
	public static void arrayCopy() {
		
		int[] oldAry = {45,55,67};
		int[] newAry = new int[3];
		
		for(int i = 0; i < oldAry.length ; i++) {
			newAry[i] = oldAry[i];
//			System.out.println(newAry[i]);
		}
		
		int[] newAry2 = new int[5];
		System.arraycopy(newAry, 0, newAry2,  0,  2   );
		//               원본배열	    여기다복사		 여기까지
		//					  여기서부터	   여기서부터 
		
		for(int i = 0; i < newAry2.length ; i++) {
			System.out.println(newAry2[i]);
		}

	}

}
