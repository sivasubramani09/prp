package mini_projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OperationsOnStringList {
	List<String> dict = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	protected void insert() {
		System.out.print("Enter the item to be inserted: ");
		dict.add(sc.next());
		System.out.print("Inserted successfully.");
	}
	protected void search() {
		System.out.print("Enter an item to search: ");
		if(dict.contains(sc.next())) {
			System.out.print("Item found in the list.");
		}else {
			System.out.print("Item not found in the list.");
		}
	}
	protected void delete() {
		System.out.print("Enter the item to delete: ");
		String toBeDeleted = sc.next();
		if(dict.contains(toBeDeleted)) {
			dict.remove(toBeDeleted);
			System.out.print("Deleted successfully");
		}else {
			System.out.print("Item does not exist.");
		}
	}
	protected void display() {
		Iterator<String> itr = dict.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	protected void replace() {
		System.out.format("\nThere are %d elements in the list",dict.size());
		System.out.format("\nEnter the index (0 to %d) that you want to replace: ",dict.size()-1);
		int index = sc.nextInt();
		if(index<dict.size()) {
			System.out.print("What do you want to replace it with? ");
			String tobeReplaced = sc.next();
			dict.set(index, tobeReplaced);
			System.out.print("Item replaced successfully.");
		}else {
			System.out.print("That's an invalid element.");
		}
	}
	protected void sort() {
		dict.sort(new Comparator<String>() {
			@Override
			public int compare(String str1,String str2) {
				return str1.compareTo(str2);
			}
		});
		System.out.print("The elements have been sorted in ascending order.");
	}
	protected void shuffle() {
		Collections.shuffle(dict);
		System.out.print("The elements have been shuffled randomly.");
	}
	protected void reverse() {
		Collections.reverse(dict);
		System.out.print("The position of the elements have been reversed.");
	}
	public static void main(String[] args) {
		int choice = 0;
		OperationsOnStringList dictionary = new OperationsOnStringList();
		do {
			System.out.println("\nMAIN MENU\n---------");
			System.out.println("1.Insert");
			System.out.println("2.Search");
			System.out.println("3.Delete");
			System.out.println("3.Display");
			System.out.println("5.Replace");
			System.out.println("6.Sort");
			System.out.println("7.Shuffle");
			System.out.println("8.Reverse");
			System.out.println("9.Exit");
			System.out.print("Enter your choice  (1..9): ");
			choice = sc.nextInt();
			switch(choice) {
			case 1: dictionary.insert();break;
			case 2: dictionary.search();break;
			case 3: dictionary.delete();break;
			case 4: dictionary.display();break;
			case 5: dictionary.replace();break;
			case 6: dictionary.sort();break;
			case 7: dictionary.shuffle();break;
			case 8: dictionary.reverse();break;
			case 9: System.out.print("Exiting...Thanks for using the application!!");break;
			default: System.out.print("\nEnter the valid choice.");break;
			}
		}while(choice!=9);
		sc.close();
	}
}
