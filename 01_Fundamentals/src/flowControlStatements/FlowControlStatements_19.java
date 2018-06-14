// Write a program to print first 5 values which are divisible by 2, 3, and 5.
package flowControlStatements;

public class FlowControlStatements_19 {
	public static void main(String[] args) {
		int nFactors = 5;
		int a[] = new int [nFactors];
		int countFactors = 0;
		int i = 1; // i is incremented from 1 to n, until 5 countFactorss are found.
		
		// The No. of countFactorss we need : 5
		while(countFactors < nFactors) {
			if((i % 2==0)&&(i % 3 == 0)&&(i % 5 == 0)) {
				a[countFactors] = i;
				System.out.print(a[countFactors]+"\t");
				countFactors ++;
			}
			i++;
		}
	}
}
