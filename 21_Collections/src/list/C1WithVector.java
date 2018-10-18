package list;

import java.util.Iterator;
import java.util.Vector;

public class C1WithVector {
	static Vector<Integer> A1 = new Vector<Integer>();
	static Vector<Integer> A2 = new Vector<Integer>();
	Vector<Integer> saveEvenNumbers(int N) {
		for(int i=2;i<=N;i++) {
			if(i%2 == 0) {
				A1.add(i);
			}
		}
		return A1;
	}
	Vector<Integer> printEvenNumbers() {
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
		C1WithVector c = new C1WithVector();
		System.out.println(c.saveEvenNumbers(6));
		System.out.println(c.printEvenNumbers());
		System.out.println(c.printEvenNumber(6));
	}
	

}
