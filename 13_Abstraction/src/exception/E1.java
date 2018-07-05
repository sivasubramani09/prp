package exception;

import java.util.Scanner;

/*
	Handle exception in number
	Problem statement: 
	Get the input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output). 
	Sample input and output 1: 
	Enter an integer: 12
	The square value is 144
	The work has been done successfully
	Sample input and output 2:
	Enter an integer: Java
	Entered input is not a valid format for an integer.
 * */
public class E1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		String str = sc.next();
		sc.close();
		try {
			int a = Integer.parseInt(str);
			System.out.println("The entered integer is "+a);
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}

}
