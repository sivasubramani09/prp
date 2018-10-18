// Write a program to check if a given number is prime or not.
package flowControlStatements;

import java.util.Scanner;

public class FlowControlStatements_12 {

	public static void main(String[] args) {
				System.out.println("Enter the number:\t");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				sc.close();
				boolean isPrime = true;
				for(int i=2; i<num; i++) {
					if(num % i == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					System.out.println("The Given Number is a prime number.");
				}
				else {
					System.out.println("The Given Number is not a prime number");
				}
				
			}

		}