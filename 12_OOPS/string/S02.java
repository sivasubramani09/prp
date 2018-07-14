package string;

import java.util.Scanner;

/*
 *  Given two strings, append them together (known as "concatenation") and return the result.
 *  However, if the concatenation creates a double-char, then omit one of the chars.
 *  If the inputs are “Mark” and “Kate” then the ouput should be “markate”.
 * (The output should be in lowercase)
 * */
public class S02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings:");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		String str3="";
		if(str1.charAt(str1.length()-1) == str2.charAt(0)) {
			str3 = str1.substring(0, str1.length()-1)+str2;
		}else {
			str3 = str1+str2;
		}
		System.out.println("The concatenation of two strings is: ");
		System.out.println(str3.toLowerCase());
	}	
}
