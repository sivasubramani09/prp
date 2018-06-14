//Write a program to initialize an array and print them in a sorted fashion
package arrays;

import java.util.Arrays;

public class Arrays_06 {
	public static void main(String[] args) {
		int num[] = { 1, 109, 99, 87, 500};
		Arrays.sort(num);
		System.out.println("Array after sorting: \n");
		System.out.println(Arrays.toString(num));
	}

}
