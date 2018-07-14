package string;

import java.util.Scanner;

/*
 * Write a Program that will check whether a given String is Palindrome or not
 * */
public class S01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string:");
	String str = sc.next();
	sc.close();
	StringBuilder sb = new StringBuilder(str);
	sb.reverse();
	String rev = sb.toString();
	if(str.equals(rev)){
		System.out.println("The given String is a palindrome.");
	}else {
		System.out.println("The given string is not a palindrome.");
	}
}
}
