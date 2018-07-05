/*
 * Write a program to reverse a given number and print
 * Eg1)
 * I/P: 1234
 * O/P:4321
 * Eg2)
 * I/P:1004
 * O/P:4001
 * */
package flowControlStatements;

public class FlowControlStatements_17 {

	public static void main(String[] args) {
		int num = 1456;
		int reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reverse);
	}

}
