/*
 * Write a Java program to find if the given number is palindrome or not
 * Example1:
 * C:\>java Sample 110011
 * O/P Expected : 110011 is a palindrome
 * 
 * Example2:
 * C:\>java Sample 1234
 * O/P Expected : 1234 is not a palindrome
*/
package flowControlStatements;

public class FlowControlStatements_18 {
	public static void main(String[] args) {
		if(args.length<=0) {
			System.out.println("Please enter an integer number.");
		}
		else {
			int num = Integer.parseInt(args[0]);
			int reverse = 0;
			int temp = num;
	        while(temp != 0) {
	            int digit = temp % 10;
	            reverse = reverse * 10 + digit;
	            temp /= 10;
	        }
	        if(reverse == num) {
	        	System.out.println(num+" is a palindrome.");
	        }
	        else {
	        	System.out.println(num+" is not a palindrome.");
	        }
		}
	}
}
