package string;

import java.util.Scanner;

/*Given a string of even length, return the first half.
 * So the string "CatDog" yields "Cat".
 * If the string length is odd number then return null.
 * */
public class S04 {
public static void main(String[] args) {
	System.out.println("Enter a String: ");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	sc.close();
	if(str.length()%2 ==0) {
		System.out.println(str.substring(0, str.length()/2));
	}else {
		System.out.println("NUll");
	}
}
}
