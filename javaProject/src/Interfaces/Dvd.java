package Interfaces;

public class Dvd implements RemoteControl{

	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("디비디를 킵니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("디비디를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
