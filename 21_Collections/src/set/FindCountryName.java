package set;

import java.util.HashSet;
import java.util.Iterator;

/*
 *  Develop a java class with a instance variable Country  HashSet (H1)  add a method saveCountryNames(String CountryName),
 *  the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
 *  Develop a method getCountry(String CountryName) which iterates through the HashSet and
 *  returns the country if exist else return null. 
 *  NOTE: You can test the methods using a main method.
 * */
public class FindCountryName {
	
	static HashSet<String> h1 = new HashSet<>();

	public String getCountry(String findCountry) {
		Iterator<String> itr = h1.iterator();
		while(itr.hasNext()) {
			String name  = itr.next();
			if(name.equals(findCountry))
				return name;
		}
		return null;
	}
	public static void main(String[] args) {
		h1.add("India");
		h1.add("China");
		h1.add("UK");
		FindCountryName f1 = new FindCountryName();
		System.out.println(f1.getCountry("UK"));
}
}
