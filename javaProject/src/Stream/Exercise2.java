package Stream;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("Hong",Member.MALE, 30),
				new Member("Kim", Member.MALE, 20),
				new Member("Shin", Member.FEMALE, 46),
				new Member("Park", Member.FEMALE, 27),
				new Member("Hong",Member.MALE, 30)
		);
		
		list.stream().distinct()
		.forEach(m -> System.out.println(m.toString()));
	}
}
