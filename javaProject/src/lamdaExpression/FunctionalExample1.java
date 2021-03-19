package lamdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import Hr.EmpDAO;
import Hr.Employee;
import Stream.Student;

public class FunctionalExample1 {

	private static List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("신용권", 95));

	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	// main
	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		Stream<Employee> stream = list.stream();
		
//		stream.forEach(new Consumer<Employee>() {
//			@Override
//			public void accept(Employee e) {
//				System.out.println(e.getFirstName() + " " + e.getSalary());
//			}
//		});
		
		
//		stream.forEach(e -> System.out.println(e.getFirstName() + " " + e.getSalary()));
//		
//		stream.mapToInt(new ToIntFunction<Employee>() {
//			@Override
//			public int applyAsInt(Employee e) {
//				return e.getSalary();
//			}
//		});
		
		stream.mapToInt(e -> e.getSalary())
		.filter(v -> v > 5000)
		.forEach(t -> System.out.println(" salary: " + t));
		
		
		
		
		printString(new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		});
		
		// 위에껄 간소화 시킨게 아래임

		printString((t) -> t.getName());
		printInt(t -> t.getScore());

	}

}
