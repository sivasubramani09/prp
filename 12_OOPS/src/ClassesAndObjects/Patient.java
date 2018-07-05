package ClassesAndObjects;

public class Patient {
	String name;
	double height;
	double weight;
	public Patient(String n, double h,double w){
		name = n;
		height = h;
		weight = w;
	}
	double displayBMI() {
		double bmi = (weight/(height*height))*703;
		return bmi;
	}
	public static void main(String[] args) {
		Patient p1 = new Patient("Nalan",160,60);
		System.out.println("BMI is: "+p1.displayBMI());
	}
}
