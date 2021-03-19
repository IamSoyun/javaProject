package Interfaces;

public interface RemoteControl {
	
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	void turnOn(); //중괄호x 추상메소드(구현x)
	void turnOff();
	void setVolume(int volume);

}
