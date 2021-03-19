package Inher;

public class DmbPhone extends Cellphone {
	
	int channel;
	
	DmbPhone(){}
	
	DmbPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 dmb 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "로 바꿉니다.");
	} 
	
	void turnOffDmb() {
		System.out.println("dmb 방송 수신을 멈춥니다.");
	}
	
	@Override
	public String toString() {
		return "DmbPhone > model : " + model + " color: " + color + " 채널: " + channel;
	}
	
	@Override
	void powerOn() {
		System.out.println("dmb 전화를 켭니다.");
	}
	
	@Override
	void powerOff() {
		System.out.println("dmb 전화를 끕니다.");
	}
	
//	@Override
//	void bell() {
//		System.out.println("dmb 벨이 울립니다.");
	
}
