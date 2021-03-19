package java0318;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam04 {
	public static void main(String[] args) {
		
		List<Student> stds = Arrays.asList(
				new Student("홍길동",80,70),
				new Student("김길동",40,50),
				new Student("박길동",60,70),
				new Student("이길동",20,70)
		);
		
		stds.stream().filter(s -> s.getEngScore() + s.getMathScore() < 100)
						.forEach(s -> System.out.println(s.toString()));
	}

}
