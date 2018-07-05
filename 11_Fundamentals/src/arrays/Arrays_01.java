// Write a program to initialize an integer array and print the sum and average of the array
package arrays;

public class Arrays_01 {
	public static void main(String[] args) {
		int numbers[] = { 1,2,4,6,8,9 };
		int sum =0;
		for(int i=0; i<numbers.length; i++) {
			sum+= numbers[i];
		}
		int avg = sum/numbers.length;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
	}

}
