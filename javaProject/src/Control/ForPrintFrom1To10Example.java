package Control;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		
//		for(int i = 0 ; i < 30 ; i++) {
//			int num = (int) (Math.random()*10) + 1;
//			System.out.print(num + " ");
//		}
		
		String msg = "짝수/홀수";
		int z = (int) (Math.random()*6) + 1;
		
		switch(z%2) {
		case 1:
			msg = "홀수";
			break;
		case 0:
			msg = "짝수";
			break;
		default:
		}
		
		System.out.println(z + " " + msg);
	}

}
