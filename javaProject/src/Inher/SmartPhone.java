package Inher;

public class SmartPhone extends DmbPhone {
	
	SmartPhone(){
		super("adsf","Asdf",30);
	}
	
	@Override
	void powerOn() {
		System.out.println("스맛폰 전화를 켭니다.");
	}
	
	@Override
	void powerOff() {
		System.out.println("스맛폰 전화를 끕니다.");
	}

}
