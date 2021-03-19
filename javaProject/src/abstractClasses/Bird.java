package abstractClasses;

public class Bird extends Animal{
	
	public Bird(String species) {
		super(species);
	}
	
	public Bird() {}

	@Override
	public void sound() {
		System.out.println("짹짹");
	}
	
	public void hi() {
		System.out.println("ih");
	}

}
