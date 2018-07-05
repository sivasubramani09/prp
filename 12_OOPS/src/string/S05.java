package string;

import java.util.Scanner;

/*
 * Given a string, return a version without the first and last char,
 * so "Wipro" yields "ipr".
 * The string length will be at least 2.
 * */
public class S05 {
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		if(str.length()>=2) {
			System.out.println(str.substring(1, str.length()-1));
		}
	}
}
