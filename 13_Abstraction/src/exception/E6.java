package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
import UserDefinedException.*;

/*
	Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students.
	The name of the students and marks in 3 subjects are taken from the user while executing the program.
	In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
 * */
public class E6 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student1 marks:");
			System.out.println("Subject1:");
			int sub11=sc.nextInt();
			System.out.println("Subject2:");
			int sub12 = sc.nextInt();
			System.out.println("Subject3:");
			int sub13 = sc.nextInt();
			System.out.println("Enter student2 marks:");
			System.out.println("Subject1:");
			int sub21=sc.nextInt();
			System.out.println("Subject2:");
			int sub22 = sc.nextInt();
			System.out.println("Subject3:");
			int sub23 = sc.nextInt();
			sc.close();
			if(sub11<0 || sub12<0 ||sub13<0 || sub21<0 ||sub22<0 || sub23<0) {
				throw new NegativeValueException();
			}
			int avg1 = (sub11+sub12+sub13)/3;
			int avg2 = (sub21+sub22+sub23)/3;
			if(sub11>100 || sub12>100 ||sub13>100 || sub21>100 ||sub22>100 || sub23>100) {
				throw new OutOfRangeException() ;
			}
			System.out.println("Average marks of student1: "+avg1);
			System.out.println("Average marks of student2: "+avg2);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(NegativeValueException e)
		{
			System.out.println(e);
		}
		catch(OutOfRangeException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
}
