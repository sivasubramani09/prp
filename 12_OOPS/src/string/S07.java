package string;

import java.util.Scanner;
/*
 * Given a string, if the first or last chars are 'x',
 * return the string without those 'x' chars, and
 * otherwise return the string unchanged.
 * If the input is "xHix", then output is "Hi".
 * */
public class S07 {
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		if(str.startsWith("x")) {
			str = str.substring(1);
		}
		if(str.endsWith("x")) {
			str = str.substring(0, str.length()-1);
		}
		System.out.println(str);
	}
}
