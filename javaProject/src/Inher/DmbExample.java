package Inher;

public class DmbExample {
	public static void main(String[] args) {
		
		DmbPhone dmb = new DmbPhone("자바폰", "검정", 10);
		Cellphone cp = new Cellphone();
		cp.model = "셀폰모델";
		cp.color = "셀폰색상";
		
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);
		System.out.println("채널: "+ dmb.channel);
		
		System.out.println("==========");
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();

		System.out.println("==========");
		dmb.powerOn();
		dmb.bell();
		
		System.out.println("==========");
		SmartPhone sp = new SmartPhone();
		sp.model = "LG";
		sp.color = "Pink";
		
		System.out.println(cp);
		System.out.println(dmb);
		System.out.println(sp);
	}
}
