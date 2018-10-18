//Write a program to print prime numbers between 10 and 99.
package flowControlStatements;

public class FlowControlStatements_13 {
		public static void main(String[] args) {
			boolean isPrime=true;
			int num = 10;
			while(num++ !=99) {
				for(int i=2; i<num; i++) {
					if(num % i == 0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime) {
					System.out.println("Num:\t"+num);
				}
				isPrime=true; //resetting
			}
		}
	}