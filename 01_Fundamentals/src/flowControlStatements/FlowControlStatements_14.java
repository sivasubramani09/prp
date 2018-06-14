/*
 * Write a Java program to find if the given number is prime or not.
 * Example1:
 * C:\>java Sample 
 * O/P Expected : Please enter an integer number 
 * 
 * Example2:
 * C:\>java Sample 1
 * O/P Expected : 1 is neither prime nor composite
 * 
 * Example3:
 * C:\>java Sample 0
 * O/P Expected : 0 is neither prime nor composite
 * 
 * Example4:
 * C:\>java Sample 10
 * O/P Expected : 10 is not a prime number
 * 
 * Example5:
 * C:\>java Sample 7
 * O/P Expected : 7 is a prime number
 * */
package flowControlStatements;

public class FlowControlStatements_14 {
	public static void main(String[] args) {
		if(args.length<=0) {
			System.out.println("Please enter an integer number.");
		}
		else {
			int num = Integer.parseInt(args[0]);
			if((num == 0)||(num == 1)) {
				System.out.println(num+ " is neither a prime nor a composite.");
			}
			else {
				int count = 0;
				for(int i=1; i<=num; i++) {
					if(num % i == 0) {
						count++;
					}
				}
				if(count == 2) {
					System.out.println("The Given Number is a prime number.");
				}
				else {
					System.out.println("The Given Number is not a prime number");
				}


			}
		}
	}
}
