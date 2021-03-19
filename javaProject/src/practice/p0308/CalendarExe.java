package practice.p0308;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExe {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇년도? ");
		int year = sc.nextInt();
		System.out.print("몇월? ");
		int month = sc.nextInt() - 1;
		
		calendar(year, month);
		
	}
	
	public static void calendar(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		int count = 0;
		
		cal.set(year, month, 1); // 1일로 설정
		int FirstDay = cal.get(Calendar.DAY_OF_WEEK); // 1일이 무슨 요일인지 get
		
		System.out.printf("\t<%4d년 %2d월> \n\n",year,month+1);
		System.out.printf(" %3s %3s %3s %3s %3s %3s %3s\n","SUN","MON","TUS","WEN","THU","FRI","SAT");
		
		for(int i = 0 ; i < FirstDay-1 ; i++) //앞에 빈공간 찍기
			System.out.printf(" %3s"," ");
		
		for(int i = 1 ; i <= cal.getActualMaximum(Calendar.DATE) ; i++){
			
			System.out.printf(" %3d",i);

			if(i == 8-FirstDay + (7*count)) { //개행
				System.out.println();
				count++; 
			}
			
		}
		
	}
	
}
