/*
 *  Initialize a character variable in a program and
 * if the value is alphabet then print "Alphabet" if it’s a number then print "Digit" and
 * for other characters print "Special Character"
 * */
package flowControlStatements;

public class FlowControlStatements_05 {

	public static void main(String[] args) {
		char ch = '5';
		if(Character.isAlphabetic(ch)) {
			System.out.println("Character");
		}
		else if(Character.isDigit(ch)) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
		
	}

}
