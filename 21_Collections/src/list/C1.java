package list;

import java.util.ArrayList;
import java.util.Iterator;

public class C1 {
	static ArrayList<Integer> A1 = new ArrayList<Integer>();
	static ArrayList<Integer> A2 = new ArrayList<Integer>();
	
	ArrayList<Integer> saveEvenNumbers(int N) {
		for(int i=2;i<=N;i++) {
			if(i%2 == 0) {
				A1.add(i);
			}
		}
		return A1;
	}
	ArrayList<Integer> printEvenNumbers() {
		Iterator<Integer> itr1 = A1.iterator();
		while(itr1.hasNext()) {
			//String a = ;
			A2.add((Integer.parseInt(itr1.next().toString())*2));
		}
		return A2;
	}
	int printEvenNumber(int N) {
		if(A1.contains(N)){
			return N;
		}else {
			return 0;
		}
	}
		public static void main(String[] args) {
		C1 c = new C1();
		System.out.println(c.saveEvenNumbers(6));
		System.out.println(c.printEvenNumbers());
		System.out.println(c.printEvenNumber(4));
	}
	
}
