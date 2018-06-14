/*
 * Initialize two character variables in a program and display the characters in alphabetical order.
 * Eg1) if first character is s and second is e
 * O/P: e,s
 * Eg2) if first character is a and second is e
 * O/P:a,e
 * 
 * */
package flowControlStatements;

public class FlowControlStatements_04 {
	public static void main(String[] args) {
		char ch1 = 'z';
		char ch2 = 'e';
		if(ch1<ch2) {
			System.out.println(ch1+","+ch2);
		}
		else {
			System.out.println(ch2+","+ch1);
		}
	}

}
