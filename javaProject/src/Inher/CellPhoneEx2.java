package Inher;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		Cellphone cp = new Cellphone();
//		cp = new DmbPhone();
//		cp = new SmartPhone(); // 부모 = 자식은 자동 형변환
		
		if( cp instanceof DmbPhone ) {
			DmbPhone dp = (DmbPhone) cp; 
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
		}else {
			System.out.println("캐스팅 불가.");
		}
		
		// 다형성.
		// 부모 = 자식들
		// 부모.메소드() => 자식.메소드()
		
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
		
	}
}
