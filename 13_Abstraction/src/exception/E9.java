package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
	 Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
	This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the message as shown in the sample output.
	Also illustrate the use of finally block. Print the message “Inside finally block”.
	Sample Input and Output 1:
	Enter the 2 numbers
	5
	2
	The quotient of 5/2 = 2
	Inside finally block
	Sample Input and Output 2:
	Enter the 2 numbers
	5
	DivideByZeroException caught
	Inside finally block
 * */
public class E9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers a,b: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		try {
			int c = a/b;
			System.out.println("The quotient of "+a+"/"+b+" is "+c);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
