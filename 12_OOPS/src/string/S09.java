package string;

import java.util.Scanner;
/*
 * Return a version of the given string,
 * where for every star (*) in the string the star and the chars immediately to its left and right are gone.
 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 * */
public class S09 {
	public static void main(String[] args) {
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		int find = str.indexOf('*');
		int lFind = str.lastIndexOf('*');
		String front = str.substring(0, find-1);
		String back = str.substring(lFind+2);
		System.out.print(front);
		System.out.println(back);
		
	}
}
