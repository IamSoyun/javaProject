package java0318;

import java.util.OptionalDouble;
import java.util.Set;

import Hr.EmpDAO;
import Hr.Employee;

public class Exam06 {
	public static void main(String[] args) {
		EmpDAO empDao = new EmpDAO();
		Set<Employee> emps = empDao.getEmps();
		
		double itAvg = emps.stream().filter(s -> s.getJobId().equals("IT_PROG"))
						.mapToInt(s -> s.getSalary()).average().orElse(0.0);
		
		System.out.println(itAvg);
		
		
	}
}
