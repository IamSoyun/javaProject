package abstractClasses;
import java.util.Calendar;

public class CalenderExe {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		cal.set(2020, 1 , 1);
//		System.out.println("=======================");
//		for(int i = 1 ; i <= cal.getActualMaximum(Calendar.DATE) ; i++) {
//			System.out.printf(" %2d",i);
//			if(i%7 == 0)
//				System.out.println();
//		}
		
		for(int i = 1 ; i <= cal.getActualMaximum(Calendar.DATE) ; i++) {
			for(int j = 0 ; j < Calendar.DAY_OF_WEEK ; j++) {
				System.out.printf(" %2s", " ");
			}
			System.out.printf(" %2d",i);
			if(i%(7-Calendar.DAY_OF_WEEK) == 0)
				System.out.println();
		}
		
	}
	
}
