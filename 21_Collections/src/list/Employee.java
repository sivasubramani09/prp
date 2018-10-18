package list;
/*
 *  1) Create an application for employee management having following classes:
 *  a) Create an Employee class with following attributes and behaviors :
 *  i) EmpId Int
 *  ii) EmpName String
 *  iii) EmpEmail String
 *  iv) EmpGender char
 *  v) EmpSalary float
 *  vi) GetEmployeeDetails() -> prints employee details
 *  
 *  b) Create one more class EmployeeDB which has the following methods. 
 *  i) boolean addEmployee(Employee e) 
 *  ii) boolean deleteEmployee(int empId) 
 *  iii) String showPaySlip(int empId) 
 *  iv) Employee[] listAll() 
 *  
 *  2) Do implementation of the above application with below two methods :
 *  I. Use an ArrayList which will be used to store the employees and use enumeration/iterator to process  the employees. 
 *  II. Use a TreeSet Object to store employees on the basis of their EmpId and use enumeration/iterator to process employees.
 *  [Hint: Use Comparable interface]
 *  Write a Test Program to test that all functionalities are operational.
 * */
public class Employee {
	int empId;
	String empName;
	String empEmail;
	char gender;
	float empSalary;
	public Employee(int empId,String empName, String empEmail, char gender, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.gender = gender;
		this.empSalary = empSalary;
	}
	public void getEmployeeDetails() {
		System.out.println("EmpId: "+empId);
		System.out.println("EmpName: "+empName);
		System.out.println("EmpEmail: "+empEmail);
		System.out.println("Gender: "+gender);
		System.out.println("EmpSalary: "+empSalary);
	}
}
