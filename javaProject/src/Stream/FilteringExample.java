package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringExample {
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("홍길동","신용권","김자바","신용권","신민철");
		
		name.stream().distinct().forEach(str -> System.out.println(str));
		
		System.out.println();
		name.stream().filter(str -> str.contains("신"))
						.forEach(str -> System.out.println(str));
		
		System.out.println();
		name.stream().distinct().filter(str -> str.contains("신"))
						.forEach(str -> System.out.println(str));
		// 위아래 same
		System.out.println();
		name.stream().distinct().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.contains("신");
			}
			
		}).forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
		
	}
}
