package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import Hr.EmpDAO;
import Hr.Employee;

public class IteratorExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Hong");
		list.add("Kim");
		list.add("Shin");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		Stream<String> stream = list.stream();
		
//		stream.forEach(new Consumer<String>() {
//			
//			@Override
//			public void accept(String t) {
//				System.out.println(t);	
//			}
//			
//		});
		
		int sum = stream.mapToInt(s -> s.length()).sum();
		System.out.println(sum);
		
		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		
		Stream<Employee> empStream = empList.stream();
		
		int sumSalary = empStream.filter(emp -> emp.getSalary() >= 10000)
				.mapToInt(emp -> emp.getSalary()).sum();
		
		System.out.println("10,000$ 이상 Salary 합계: " + sumSalary);
		
		
		
		
		
	}
}
