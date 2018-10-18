package list;

import java.util.ArrayList;
import java.util.List;

public class NumbersOnly {

	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		System.out.println("Enter the element to be added: ");
		double d = 9;
		list.add(d);
		System.out.println(list);
	}
}
