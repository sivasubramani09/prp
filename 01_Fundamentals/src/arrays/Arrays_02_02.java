// Write a program to initialize an integer array and find the maximum and minimum value of an array
package arrays;

public class Arrays_02_02 {
	public static void main(String[] args) {
		int num[] = { 1, 28, 90, 87, 500};
		int max = num[0];
		int min = num[0];
		for(int i=0; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("Maximum\t"+max+"\nMinimum\t"+min);
	}
}
