package string;

import java.util.Scanner;
/*
 * Given a string and a non-empty word string, return a string made of each
 * char just before and just after every appearance of the word in the string.
 * Ignore cases where there is no char before or after the word,
 * and a char may be included twice if it is between two words.

If inputs are "abcXY123XYijk" and "XY", output should be "c13i".
If inputs are "XY123XY" and "XY", output should be "13".
If inputs are "XY1XY" and "XY", output should be "11". 
 * */
public class S13 {
public static void main(String[] args) {
	System.out.println("Enter the string and pattern: ");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	String ptn = sc.next();
	sc.close();
	StringBuilder sb = new StringBuilder();
	int temp=0;
	int lTemp=-1;
		int find = str.indexOf(ptn);
		int lFind = str.lastIndexOf(ptn);
		if(str.startsWith(ptn)) { 	
			//If the given string starts with the pattern this will be executed.
			sb.append(str.charAt(find+ptn.length()));
		}
		if(str.endsWith(ptn)) {		
			//If the given string ends with pattern this block will get executed.
			sb.append(str.charAt(lFind-1));
		}
		if(find != 0) {	
			if(temp!=find) {
				sb.append(str.charAt(find-1));
				sb.append(str.charAt(find+ptn.length()));
			}
		}
		if(lFind != str.length()-ptn.length()) {
			if(lTemp!=lFind) {
				if(lFind!=find) {	
				sb.append(str.charAt(lFind-1));
				sb.append(str.charAt(lFind+ptn.length()));
				}
			}
		}
			lTemp = lFind;
			temp = find;
			System.out.println(sb.toString());
		}
}

