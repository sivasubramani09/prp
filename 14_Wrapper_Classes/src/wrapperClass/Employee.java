package wrapperClass;
public class Employee implements Cloneable {
		public Employee() {
			
		}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		try {
			Employee e2 = (Employee) e1.clone();
			System.out.println(e1);
			System.out.println(e2);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
