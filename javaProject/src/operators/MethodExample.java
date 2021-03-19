package operators;

public class MethodExample {
	public static void main(String[] args) {

		System.out.println(sum(10, 20));
		System.out.println(minus(30, 20));
		System.out.println(multi(15, 13));
		System.out.println(divide(30, 12));
		

	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}

}
