package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringOnly {
	
	void print(List<String> al) {
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		StringOnly p1 = new StringOnly();
		List<String> str = new ArrayList<>();
		str.add("Sivasubramani");
		str.add("Tech Enthusiast");
		str.add("Software Development as a hobby");
		p1.print(str);
		
	}
}
