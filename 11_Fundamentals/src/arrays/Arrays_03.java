/* 
 * Write a program to initialize an integer array with values and check if a given number is present in the array or not.
 * If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
 * Ex1) Array elements are  {1,4,34,56,7} and the search element is 90
 * O/P: -1
 * Ex2)Array elements are  {1,4,34,56,7} and the search element is 56
 * O/P: 4 
 * */
package arrays;

import java.util.Scanner;

public class Arrays_03 {

	public static void main(String[] args) {
		int a[] = { 1,4,34,56,7};
		int search;
		int found = 0;
		System.out.println("Enter the number to be searched : ");
		Scanner sc = new Scanner(System.in);
		search = sc.nextInt();
		sc.close();
		for(int i=0; i<a.length; i++) {
			if(search == a[i]) {
				System.out.println(i);
				found++;
			}
		}
		if(found == 0) {
			System.out.println("-1"); //Not found
		}
	}

}
