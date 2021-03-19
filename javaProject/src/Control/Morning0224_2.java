package Control;

public class Morning0224_2 {

	public static void main(String[] args) {

		System.out.println(getSum(11, 30));
	}

	public static int getSum(int fromValue, int toValue) {

		int sum = 0;
		for (int i = fromValue; i <= toValue; i++) {
			sum += i;
		}

		return sum;
	}

}
