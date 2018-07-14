package string;

import java.util.Scanner;

/*
 *  Given two strings, a and b, create a bigger string made of the first char of a,
 *  the first char of b, the second char of a, the second char of b,
 *  and so on. Any leftover chars go at the end of the result.
 *  If the inputs are "Hello" and "World", then the output is "HWeolrllod".
 * */
public class S10 {
	public static void main(String[] args) {
		System.out.println("Enter two strings: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		int n=0;
		String res="";
		if(str1.length()>str2.length()) {
			n= str1.length();
		}else {
			n= str2.length();
		}
		for(int i=0;i<n;i++) {
			if(str1.length() > i) {
				res += str1.charAt(i);
			}
			if(str2.length()>i) {
				res += str2.charAt(i);
			}
		}
		System.out.println(res);
	}
}
