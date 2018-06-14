 //Initialize an integer array with ascii values and print the corresponding character values in a single row.
package arrays;

public class Array_04 {

	public static void main(String[] args) {
		char ch;
		int myName[] = { 83,73,86,65,83,85,66,82,65,77,65,78,73};
		for(int i=0; i<myName.length; i++) {
			ch = (char) myName[i];
			System.out.print(ch);
		}
	}

}
