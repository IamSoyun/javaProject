package References;

import java.util.Calendar;

enum Kind {
	MALE, FEMALE;
}

enum Yn {
	YES, NO;
}

public class EnmExample {
	public static void main(String[] args) {
		
		Week today = null;
		today = Week.SUNDAY;
		Calendar cal = Calendar.getInstance();

		System.out.println("년도 " + cal.get(Calendar.YEAR));
		System.out.println("월 " + cal.get(Calendar.MONTH));
		System.out.println("일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 " + cal.get(Calendar.DAY_OF_WEEK));

		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println(today);

		
		if (today == Week.SUNDAY || today == Week.SATURDAY)
	//  if (today == 1 || today == 7)
		{
			System.out.println("주말엔 쉬세요");
		} else {
			System.out.println("주중엔 공부하세요");
		}
		
		Kind manOrWoman = Kind.FEMALE;
		if(manOrWoman==Kind.FEMALE) {
			System.out.println("여자임");
		}else {
			System.out.println("남자임");
		}
		
		

	}

}
