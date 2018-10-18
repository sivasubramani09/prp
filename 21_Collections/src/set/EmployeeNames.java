package set;

import java.util.HashSet;
import java.util.Iterator;

/*
 *  Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.
 * */
public class EmployeeNames {
	public static void main(String[] args) {
		HashSet<String> empName = new HashSet <String> ();
		empName.add("Sivasubramani");
		empName.add("Gnanaprakash");
		empName.add("Soundarrajan");
		empName.add("Vignesh");
		Iterator<String>itr = empName.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
