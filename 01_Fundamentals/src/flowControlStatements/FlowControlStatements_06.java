/*
 * Write a program to accept gender ("Male" or "Female") and age (1-120)
 * from command line arguments and print the percentage of interest based on the given conditions.
 * Interest == 8.2% 
 * Gender ==> Female
 * Age    ==>1 to 58
 * Interest == 7.6% 
 * Gender ==> Female
 * Age    ==>59 -120
 * Interest == 9.2% 
 * Gender ==> Male
 * Age    ==>1-60
 * Interest == 8.3% 
 * Gender ==> Male
 * Age    ==>61-120
 */
package flowControlStatements;

public class FlowControlStatements_06 {
	public static void main(String[] args) {
		System.out.println("Enter Gender <space> age: ");
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		if(gender=="Female") {
			if((age>1)&&(age<58)){
				System.out.println("Interest : 8.2%");				
			}
			else {
				System.out.println("Interest : 7.6%");
			}
		}
		else {
			if((age>1)&&(age<60)){
				System.out.println("Interest : 9.2%");				
			}
			else {
				System.out.println("Interest : 8.3%");
			}
		}
	}

}
