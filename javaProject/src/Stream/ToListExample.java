package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Hr.EmpDAO;
import Hr.Employee;

public class ToListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hong","Hwang","Park");
		
		Collector<Object, ?, List<Object>> col = Collectors.toList();
		
		List<Object> newList = list.stream()
				.filter(s -> s.startsWith("H"))
				.collect(col);
		
		for(Object str : newList) {
			System.out.println(str);
		}
		
		System.out.println("--------------------------------------------------");
		EmpDAO dao = new EmpDAO();
		Set<Employee> emps = dao.getEmps();
		
		List<Employee> itEmps = emps.stream().filter(e -> e.getJobId().equals("IT_PROG"))
									.collect(Collectors.toList());
		
		itEmps.stream().forEach(e -> System.out.println(e.toString()));
	}
}
