import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee{
	String firstName;
	String lastName;
	long mobileNumber;
	String emailId;
	String address;
	public Employee(String firstName,String lastName,long mobileNumber,String emailId,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.address = address;
	}
}
public class ManageEmployeeDetails {
	public static void main(String[] args) {
		String fName="";
		String lName="";
		long mNo = 0;
		String emailId = "";
		String address = "";
		List<Employee> empList = new ArrayList<>();
		System.out.print("Enter the number of employees: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("\nEnter Employee "+(i+1)+" Details -");
			System.out.println("Enter your Firstname:");
			fName = sc.next();
			System.out.println("Enter your Lastname:");
			lName = sc.next();
			System.out.println("Enter your Mobile:");
			mNo = sc.nextLong();
			System.out.println("Enter your Email:");
			emailId = sc.next();
			System.out.println("Enter your Address:");
			address = sc.next();
			empList.add(new Employee(fName, lName, mNo, emailId, address));
		}
		sc.close();
		//Sort by first name
		empList.sort(new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.firstName.compareTo(o2.firstName);
			}
						
		});
		Iterator<Employee> itr = empList.iterator();
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n", e.firstName, e.lastName, e.mobileNumber, e.emailId, e.address);
		}
		
	}
}
