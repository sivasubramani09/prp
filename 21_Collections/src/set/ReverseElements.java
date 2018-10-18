package set;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Create Collection called TreeSet which is capable of storing String objects. The Collection should have the following capabilities
 * a)Reverse the elements of the Collection 
 * b)Iterate the elements of the TreeSet 
 * c) Checked if a particular element exists or not
 * */
public class ReverseElements {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("one");
		tree.add("two");
		tree.add("three");
		tree.add("four");
		Iterator<String> itr = tree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
