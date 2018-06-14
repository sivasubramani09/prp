// Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array
package arrays;
import java.util.Arrays;
public class Arrays_05 {

	public static void main(String[] args) {
		int num[] = { 1, 99, 100, 600, 500};
		for(int i=0; i<num.length; i++) {
			for(int j=1; j<i; j++) {
				if(num[j] >num[i]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println("Smallest 2 numbers:");
		System.out.println(num[0]+" "+num[1]);
		System.out.println("Largest 2 numbers:");
		System.out.println(num[num.length-2]+" "+num[num.length-1]);

	}
}
