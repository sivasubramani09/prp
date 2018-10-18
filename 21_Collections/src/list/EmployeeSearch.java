package list;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeSearch {

	public static void main(String[] args) {
		ArrayList<Employee> empSe = new ArrayList<Employee>();
		Employee e1 = new Employee(1808222, "Sivasubramani", "sivasubramani099@gmail.com", 'M', 1500000);
		Employee e2 = new Employee(1808221, "Sivasakthi", "siva18dcp@gmail.com", 'M', 2000000);
		empSe.add(e1);
		empSe.add(e2);
		int findId = 1808222;
		Iterator<Employee> itr = empSe.iterator();
		while(itr.hasNext()){
			Employee t = itr.next();
			if(t.empId == findId) {
				//System.out.println(t.empName);
				t.getEmployeeDetails();
				System.out.println("The Employee Object you searched for is : "+t);
			}
		}
		//System.out.println(empSe.toArray());
	}
}
