package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortExample {
	public static void main(String[] args) {
		int[] intAry = {5,3,2,1,4};
		IntStream is = Arrays.stream(intAry);
		is.sorted().forEach(number -> System.out.println(number));
		
		Student[] stdAry = { 
				new Student("홍길동", 80),
				new Student("김대박", 40),
				new Student("이시은", 90) };
		
		Stream<Student> st = Arrays.stream(stdAry);
		st.sorted().forEach( std -> System.out.println(std.getScore()));
		
	}
}

