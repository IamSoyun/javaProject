package abstractClasses;

public abstract class Animal {
	
	String species;
	
	public Animal() {
		
	}
	
	public Animal(String species) {
		this.species = species;
	}
	
	public void showInfo() {
		System.out.println("종류는: " + this.species + "입니다.");
	}
	
	public void breathe() {
		System.out.println("숨을 쉰다. ");
	}
	
	public abstract void sound(); 
	//Animal 클래스를 상속받는 클래스들은 모두 sound() 메소드를 정의하도록 강제함.

}
