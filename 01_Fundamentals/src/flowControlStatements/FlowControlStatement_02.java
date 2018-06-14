//Write a program to check if a given number is odd or even.
 

package flowControlStatements;

import java.util.Scanner;

public class FlowControlStatement_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		sc.close();
		if(a%2 == 0) {
			System.out.println("The given number is a even number.");
		}
		else {
			System.out.println("The given number is a odd number.");
		}
	}
}
