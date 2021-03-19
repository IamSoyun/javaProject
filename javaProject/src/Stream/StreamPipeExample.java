package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamPipeExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("Hong",Member.MALE, 30),
				new Member("Kim", Member.MALE, 20),
				new Member("Shin", Member.FEMALE, 46),
				new Member("Park", Member.FEMALE, 27)
		);
		
		Stream<Member> stream = list.stream();
		OptionalDouble sum = stream.filter(mem -> mem.getSex() == Member.MALE)
							.mapToInt(mem -> mem.getAge())
							.average();
		
		
//		OptionalDouble maleAgeAvg = 
//		stream.filter(new Predicate<Member>() {
//
//			@Override
//			public boolean test(Member t) {
//				return t.getSex() == Member.MALE;
//			}
//			
//		}).mapToInt(new ToIntFunction<Member>() {
//
//			@Override
//			public int applyAsInt(Member value) {
//				return value.getAge();
//			}
//			
//		}).average();
		
	}

}
