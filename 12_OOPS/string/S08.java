package string;

import java.util.Scanner;
/*Given two strings, word and a separator,
 * return a big string made of count occurrences of the word,
 * separated by the separator string.
 * if the inputs are "Wipro","X" and 3 then the output is "WiproXWiproXWipro".
*/
public class S08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String, seperator and number of occurences:");
		String str = sc.next();
		String in = sc.next();
		sc.close();
		int n = sc.nextInt();
		String result="";
		for(int i=0;i<n;i++) {
			result += str+in;
		}
		System.out.println(result.substring(0, result.length()-1));
	}
}
