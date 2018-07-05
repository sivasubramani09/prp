package string;

import java.util.Scanner;
/*
 * Given a string, return a new string made of n copies of the first 2 chars of the original string,
 * where n is the length of the string.
 * The string may be any length.
 * If there are fewer than 2 chars, use whatever is there.
 * If input is "Wipro" then output should be "WiWiWiWiWi".
 * */
public class S03 {
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		sc.close();
		if(in.length()>1) {
			String front = in.substring(0, 2);
			int n = in.length();
			for(int i=0;i<n;i++) {
				System.out.print(front);
			}
		}
	}
}
