package Inheritance;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for (int i = 0; i < 7; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1 :
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeft = new HankookTire("앞왼쪽", 18);
				break;
			case 2 :
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRight = new HankookTire("앞오른쪽", 12);
				break;
			case 3 :
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeft = new HankookTire("뒤왼쪽", 15);
				break;
			case 4 :
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRight = new HankookTire("뒤오른쪽", 20);
				break;
			}
			System.out.println("-----------------------");
		}
		
		System.out.println("프로그램 종료.");
	}
}
