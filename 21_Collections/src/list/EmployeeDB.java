package list;

import java.util.ArrayList;

public class EmployeeDB {
	ArrayList<Employee> empDB = new ArrayList<Employee>();
	boolean addEmployee(Employee e) {
		try {
			empDB.add(e);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}
	boolean deleteEmployee(int empId) {
		if(empDB.indexOf(empId) != -1) {
			empDB.remove(empDB.indexOf(empId));
			return true;
		}
		else {
			return false;
		}
	}
	//String showPaySlip(int empId) {
		
	//}
	Employee[] listAll() {
		return (Employee[]) empDB.toArray();
	}

}
