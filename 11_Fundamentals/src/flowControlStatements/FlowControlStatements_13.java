//Write a program to print prime numbers between 10 and 99.
package flowControlStatements;

public class FlowControlStatements_13 {
		public static void main(String[] args) {
			int count = 0;
			int num = 10;
			while(num!=99) {
				for(int i=1; i<=num; i++) {
					if(num % i == 0) {
						count++;
					}
				}
				if(count == 2) {
					System.out.println("Num:\t"+num);
				}
				num++;
			}
		}
	}