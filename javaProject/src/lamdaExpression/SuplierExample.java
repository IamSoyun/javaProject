package lamdaExpression;

import java.util.Iterator;
import java.util.Set;
import java.util.function.DoubleSupplier;

import Hr.EmpDAO;
import Hr.Employee;

public class SuplierExample {
	public static void main(String[] args) {
		
		DoubleSupplier ds = () -> {
			
			EmpDAO dao = new EmpDAO();
			Set<Employee> set = dao.getEmps();
			Iterator<Employee> iter = set.iterator();
			int sum = 0;
			int cnt = 0;
			
			while(iter.hasNext()) {
				Employee emp = iter.next();
				sum += emp.getSalary();
				cnt++;
			}
			
			return (double) sum / cnt ;
		};
		
		System.out.println("급여평균: " + ds.getAsDouble());
		
	}
}
