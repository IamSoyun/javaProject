package Inher;

public class Cellphone {
	
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	void bell() {
		System.out.println("벨이 울립니다");
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	void commonMethod() {
		System.out.println(model + " " + color);
	}

	@Override
	public String toString() {
		return "CellPhone > model : " + model + " color: " + color;
	}
	
	

}
