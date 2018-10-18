package classesAndObjects;

public class DoCalc {

	public static void main(String[] args) {
		System.out.println(Calculator.powerDouble(10.5, 20.9));
		System.out.println(Calculator.powerInt(10, 30));
	}	
}
  class Calculator{
	static double powerInt(int num1,int num2) {
		return Math.pow(num1,num2);
	}
	static double powerDouble(double num1,double num2) {
		return Math.pow(num1, num2);
	}
}