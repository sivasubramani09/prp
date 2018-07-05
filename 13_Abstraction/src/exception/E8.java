package exception;

import java.util.Scanner;

import UserDefinedException.*;

/*
	Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
	Display proper error messages. 
	The program must exit gracefully after displaying the error message in case the arguments passed are not proper. (Hint : Create a user defined exception class for handling errors.)

 * */
public class E8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		try {
			int a = Integer.parseInt(args[0]);
			
			if(a>=18 && a<60) {
				System.out.println("The entered age is "+a);
			}else if(a<0) {
				throw new NegativeValueException();
			}else {
				throw new OutOfRangeException();
			}
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(NegativeValueException e) {
			System.out.println(e);
		}
		catch(OutOfRangeException e) {
			System.out.println(e);
		}
	}
}
