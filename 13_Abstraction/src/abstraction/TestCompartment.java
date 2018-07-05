package abstraction;

import java.util.Random;

abstract class Compartment{
	abstract void notice();
}
class FirstClass extends Compartment{
	void notice() {
		System.out.println("You are in First Class.");
	}
}
class Ladies extends Compartment{
	void notice() {
		System.out.println("You are in Ladies Class");
	}
}
class General extends Compartment{
	void notice() {
		System.out.println("You are in General Class.");
	}
}
class Luggage extends Compartment{
	void notice() {
		System.out.println("You are in Luggage Class");
	}
}
public class TestCompartment {
	public static void main(String[] args) {
		Compartment[] c = new Compartment[10];
		Random rnd = new Random();
		for(int i=0;i<10;i++) {
			int rndNo = rnd.nextInt(4);
			switch(rndNo) {
			case 0: c[i] = new FirstClass(); break;
			case 1: c[i] = new Ladies(); break;
			case 2: c[i] = new General(); break;
			case 3: c[i] = new Luggage(); break;
			}
			System.out.print("Class:"+(rndNo+1)+"\nNotice:");
			c[i].notice();
		}
	}
}
