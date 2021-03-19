package Hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {
	public static void main(String[] args) {
		
		EmpDAO empDao = new EmpDAO();
		Set<Employee> set = empDao.getEmps();
		TreeSet<Employee> tSet = new TreeSet<Employee>();
		
		Iterator<Employee> iter = set.iterator();
		while(iter.hasNext()) {
			tSet.add(iter.next());
		}
		
		iter = tSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().toString());
		}
		
	}
}
