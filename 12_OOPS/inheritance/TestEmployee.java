package inheritance;
/*
  Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.The other data members of the employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java
Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
*/
public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(50000,"123456789", 2008);
		e1.setName("Vigneshwaran");
		System.out.println(e1.getName());
		System.out.println(e1.getAnnSal());
		System.out.println(e1.getnIN());
	}
}
