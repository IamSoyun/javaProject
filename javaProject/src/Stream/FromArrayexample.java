package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayexample {
	public static void main(String[] args) {
		String[] strAry = {"Hong", "Hwang", "Kim", "Park"};
		Stream<String> stream = Arrays.stream(strAry);
		stream.forEach(s -> System.out.println(s));
		
		int[] intAry = {3, 8, 9, 5, 4};
		IntStream intStream = IntStream.of(intAry);		
		intStream = Arrays.stream(intAry);
		
		int sum = intStream.filter(i -> i%2 == 0).sum();
		System.out.println("짝수 합: " +  sum);
		
		
	}
}
