/*
 * Write a Program to accept a String as a Command line argument and the program should print a Welcome message.
 * Example :
 * 
 *   C:\> java Sample John
 *   O/P Expected : Welcome John
 *   */

package basics;

public class Bacics_02 {
	public static void main(String[] args) {
		System.out.println("Welcome "+args[0]);
	}

}
