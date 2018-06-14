/* 
 * Write a program that displays a menu with options 1. Add 2. Sub
 * Based on the options chosen, read 2 numbers and perform the relevant operation.
 * After performing the operation, the program should ask the user if he wants to continue.
 * If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.
 * [ Note: Use Scanner class, you can take help from the trainer regarding the same ]
 * */
package flowControlStatements;

import java.util.Scanner;

public class FlowControlStatements_20 {

	public static void main(String[] args) {
		System.out.println("Choose from the options below.");
		int i;
		int num1;
		int num2;
		int result;
		char ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			i = sc.nextInt();
			switch(i) {
			case 1: System.out.println("Enter two numbers: ");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					result = num1 + num2;
					System.out.println("The addition of "+num1+" and "+num2+" is "+result);
					break;
			case 2: System.out.println("Enter two numbers: ");
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					result = num1 - num2;
					System.out.println("The subtraction of "+num1+" and "+num2+" is "+result);
					break;
			default: System.out.println("Invalid Option.");
			}
			System.out.println("Do you want to continue? Y/N");
			ch = sc.next().charAt(0);
		}while(ch == ('Y'|'y'));
		sc.close();
	} 
}
