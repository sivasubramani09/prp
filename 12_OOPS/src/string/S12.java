package string;

import java.util.Scanner;
/*
 * Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
 * You may assume that n is between 0 and the length of the string, inclusive.
 * For example if the inputs are “Wipro” and 3, then the output should be “propropro”.
 * */
public class S12 {
	public static void main(String[] args) {
		System.out.println("Enter a string and number");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int n=sc.nextInt();
		String back = str.substring(str.length()-n);
		String result="";
		for(int i=0;i<n;i++) {
			result += back;
		}
		System.out.println(result);
	}

}
