package objectSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjToFile {
	public static void main(String args[]) {
		Employee e1=new Employee();
		e1.setDob("09/09/1998");
		e1.setEmpName("Soundarrajan");
		e1.setDept("EEE");
		e1.setDesignation("Senior Manger");
		e1.setSalary(1500000);
		FileOutputStream fout;
		try{
			fout = new FileOutputStream("OutObject.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fout);
			oos.writeObject(e1);
			oos.close();
			System.out.println("Object written Succesfully");
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
