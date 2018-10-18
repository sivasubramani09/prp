package objectSerialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Employee e2 =(Employee) new ObjectInputStream(new FileInputStream("OutObject.txt")).readObject();
			System.out.println("Employee Name\t: "+e2.getEmpName());
			System.out.println("DOB\t\t: "+e2.getDob());
			System.out.println("Designation\t: "+e2.getDesignation());
			System.out.println("Department\t: "+e2.getDept());
			System.out.println("Salary\t\t: "+e2.getSalary());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
