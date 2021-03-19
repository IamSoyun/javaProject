package lamdaExpression.operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동","남",90),
			new Student("김순희","여",90),
			new Student("김자바","남",95),
			new Student("박한나","남",92)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		
		return (double) sum / count;
	}
	
	public static void main(String[] args) {
		
		double maleAvg = avg( t -> t.getSex().equals("남"));
		System.out.println("남자 평균: " + maleAvg );
		
		double femaleAvg = avg(new Predicate<Student>() {
			@Override
			public boolean test(Student t) {
				return t.getSex().equals("여");
			}
		});
		System.out.println("여자 평균: " + femaleAvg);
		
	}

}
