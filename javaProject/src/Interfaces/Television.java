package Interfaces;

public class Television implements RemoteControl{

	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume >= RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <= RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println(this.volume + "로 채널을 변경합니다.");
	
		
	}

}
