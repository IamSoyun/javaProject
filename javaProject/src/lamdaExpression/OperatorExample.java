package lamdaExpression;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator operator) {

		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}

		return result;

	}

	public static void main(String[] args) {

		int max = maxOrMin(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				return left > right ? left : right;
			}
		});
		
		max = maxOrMin((left,right) -> left > right ? left : right);

		System.out.println("큰값은: " + max);
		

	}
}
