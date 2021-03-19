package References;

public class EnumMethodExample {
	
	public static void main(String[] args) {
	
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal()
		int ordinal = today.ordinal(); // 열거 객체의 순번, SUNDAY = 0번째
		System.out.println(ordinal);
		
		//compareTo()
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // 매개() 객체를 기준으로 어디에 위치하는지
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf()
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			}else
				System.out.println("평일이군요");
		}
		
		//value()
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
		
	}

}
