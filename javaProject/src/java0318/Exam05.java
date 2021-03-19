package java0318;

import java.util.OptionalDouble;
import java.util.Set;

import Hr.EmpDAO;
import Hr.Employee;

public class Exam05 {
	public static void main(String[] args) {
		EmpDAO empDao = new EmpDAO();
		Set<Employee> emps = empDao.getEmps();
		
		double avg = emps.stream().mapToInt(e -> e.getSalary()).average().getAsDouble();
		
		System.out.println("전체사원의 평균급여: " + avg);
	}
	
}
