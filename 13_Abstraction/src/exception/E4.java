package exception;
/*
	Write a class MathOperation which accepts integers from command line.
	Create an array using these parameters.
	Loop through the array and obtain the sum and average of all the elements. 
	Display the result. 
	Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
	For example: The class would be invoked as follows: 
	C:>java MathOperation 1900, 4560, 0, 32500
 * */
public class E4 {
	public static void main(String[] args) {
		int arr[] = new int[args.length];
		int sum =0;
		int avg = 0;
		try {
			for(int i=0;i<arr.length;i++) {
				arr[i] = Integer.parseInt(args[i]);
				sum += arr[i];
			}
			avg = sum/arr.length;
			System.out.println("Sum: "+sum+","+"Average: "+avg);
		}
		
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
