package lamdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Stream.Student;

public class MapAndReduceExample {
	
	
	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("홍길동",60),
				new Student("신용권",70),
				new Student("유미선",90)
			);	
			
		double avg = list.stream()
				.mapToInt(st -> st.getScore()).average().getAsDouble();
						//Student :: getEnglishScore
		System.out.println(avg);
		
		int[] intAry = {};
		Integer[] integerAry = {};
		
		IntStream is = Arrays.stream(intAry);
		Stream<Integer> iss = Arrays.stream(integerAry);
//		is = iss; 불가능
//		IntStream != Stream<Integer>
		
		
	}
			

}
