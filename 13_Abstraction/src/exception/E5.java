package exception;

import java.util.Scanner;

/*
	 Write a Program with a division method who receives two integer numbers and performs the division operation.
	 The method should declare that it throws ArithmeticException.
	 This exception should be handled in the main method.
 * */
public class E5 {
	public static double doDivision(int a,int b) throws ArithmeticException{
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for division: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		try {
			System.out.println(doDivision(x,y));
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
