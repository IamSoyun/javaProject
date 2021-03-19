package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class Exercise {
	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("Hong",Member.MALE, 30),
				new Member("Kim", Member.MALE, 20),
				new Member("Shin", Member.FEMALE, 46),
				new Member("Park", Member.FEMALE, 27)
		);
		
		Stream<Member> stream = list.stream();
		OptionalDouble avg30Up = stream.mapToInt(mem -> mem.getAge())
							.filter(age -> age >= 30).average();
		System.out.println(avg30Up);
	
		
//		OptionalDouble avg30Up = stream.mapToInt(new ToIntFunction<Member>() {
//
//			@Override
//			public int applyAsInt(Member value) {
//				return value.getAge();
//			}
//			
//		}).filter(new IntPredicate() {
//
//			@Override
//			public boolean test(int value) {
//				return value >= 30;
//			}
//			
//		}).average();
//		
//		System.out.println(avg30Up);
		
	}
	
	
	
	

}
