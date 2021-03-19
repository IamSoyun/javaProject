package lamdaExpression;

@FunctionalInterface
interface MyFuncInterface{	
	int run(int a, int b);
}

public class FunctionalExample3 {
	public static void main(String[] args) {
		MyFuncInterface mfi = (int a, int b) -> a+b;
		System.out.println(mfi.run(10, 20));

		mfi = (a, b) -> a*b;
		System.out.println(mfi.run(10, 20));

		mfi = (a, b) -> a-b;
		System.out.println(mfi.run(10, 20));
		
	}
}
