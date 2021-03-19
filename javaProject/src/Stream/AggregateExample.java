package Stream;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n -> n%2 ==0).count();
		System.out.println(count);
		

	}
}
