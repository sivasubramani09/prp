// Write a program to initialize an integer array and find the maximum and minimum value of an array
package arrays;
import java.util.Arrays;
import java.util.Collections;
public class Arrays_02 {

	public static void main(String[] args) {
        Integer[] num = { 23,17,9,12,56,77,30};
        int min = Collections.min(Arrays.asList(num));
        int max = Collections.max(Arrays.asList(num));
        System.out.println("Minimum number of array is : " + min);
        System.out.println("Maximum number of array is : " + max);
	}

}
