package lamdaExpression;

@FunctionalInterface
interface MyFunctionalInterface2 {
	void run(String str);
}

public class FunctionalExample2 {
	public static void main(String[] args) {
		
		MyFunctionalInterface2 myf = (str) -> {
			System.out.println("하하");
		};
		
	}
}
