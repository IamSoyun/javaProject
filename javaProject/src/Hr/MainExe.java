package Hr;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		
		EmpDAO empDao = new EmpDAO();
		DeptDAO deptDao = new DeptDAO();
		
		Map<String,String> jobList = deptDao.getJobList();
		Set<Entry<String,String>> set = jobList.entrySet();
		Iterator<Entry<String,String>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Entry<String,String> ent = iter.next();
			System.out.println("job_id: " +  ent.getKey() + " job_title: " + ent.getValue());
		}
		
		System.out.println(jobList.get("IT_PROG"));
		
		
		
//		List<Employee> empList = empDao.getEmpList();
//		
//		for(Employee emp : empList) {
//			System.out.println(emp.toString());
//		}
		
//		Set<Employee> empList = empDao.getEmps();
//		Iterator<Employee> EIter = empList.iterator();
//		
//		while(EIter.hasNext()) {
//			System.out.println(EIter.next().getLastName());
//		}
		

		
	}

}
