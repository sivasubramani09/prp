/*
 *  Write a program to convert from upper case to lower case and vice versa of an alphabet and
 * print the old character and new character as shown in example
 * (Ex: a->A, M->m).
 * */
package flowControlStatements;

import java.util.Scanner;

public class FlowControlStatements_07 {

	public static void main(String[] args) {
		System.out.println("Enter a Character: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(Character.isUpperCase(ch)) {
			
			System.out.println(ch+" -> "+Character.toLowerCase(ch));
		}
		else if(Character.isLowerCase(ch)) {
			
			System.out.println(ch+" -> "+Character.toUpperCase(ch));
		}
		else {
			System.out.println("Enter a valid character !!");
		}
	}

}
