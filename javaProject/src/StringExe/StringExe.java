package StringExe;

public class StringExe {

	public static void main(String[] args) {
		
		
		System.out.println("hi".charAt(0));
		System.out.println("hi".equals("bye"));
		System.out.println("hi".getBytes().length);
		
		for(byte by : "hi".getBytes()) {
			System.out.println(by);
		}
		

		System.out.println("hi".indexOf("h"));
		System.out.println("hi".length());
		System.out.println("hi".replace("hi", "bye"));
	}
	
}
