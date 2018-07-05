// Write a program to check if a given number is Positive, Negative, or Zero.

package flowControlStatements;

import java.util.Scanner;

public class FlowControlStatement_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		sc.close();
		if(a>0) {
			System.out.println("The given number is positive.");
		}
		else if(a<0) {
			System.out.println("The given number is negative.");
		}
		else {
			System.out.println("The given number is zero.");
		}
	}
}
