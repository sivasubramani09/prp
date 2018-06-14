/* Write a program to print the color name, based on color code.
 * If color code in not valid then print "Invalid Code".
 * R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
 * */
package flowControlStatements;

public class FlowControlStatements_08 {
	public static void main(String[] args) {
		char ch = 'r';
		switch(ch) {
		case 'r' : System.out.println("Red");break;
		case 'b' : System.out.println("Blue");break;
		case 'g' : System.out.println("Green");break;
		case 'o' : System.out.println("Orange");break;
		case 'y' : System.out.println("Yellow");break;
		case 'w' : System.out.println("White");break;
		default  : System.out.println("Invalid Code");
		}
	}

}
