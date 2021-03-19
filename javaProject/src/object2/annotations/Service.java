package object2.annotations;

public class Service {
	
	@printAnnotation("*")
	String name;
	
	@printAnnotation("*")
	public void method1() {
		
	}
	
	@printAnnotation(value = "*" , number = 20)
	public void method() {
		
		
	}

}
