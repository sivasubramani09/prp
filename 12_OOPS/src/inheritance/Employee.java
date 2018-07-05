package inheritance;

public class Employee extends Person{
	double annSal;
	String nIN;
	int year;
	public Employee(double d,String n,int y) {
		annSal = d;
		nIN = n;
		year = y;
	}
	public double getAnnSal() {
		return annSal;
	}
	public String getnIN() {
		return nIN;
	}
	public int getYear() {
		return year;
	}	
}
