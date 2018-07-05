// Write a program to add all the values in a given number and print. Ex: 1234->10
package flowControlStatements;

public class FlowControlStatements_15 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int temp =num;
		int sum = 0;
		while(temp>0) {
			int digit = temp % 10;
			sum += digit;
			temp /= 10;
		}
		System.out.println(num+" -> "+sum);
	}

}
