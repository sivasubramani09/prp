package inheritance;

abstract class Animal{
	abstract void eat();
	abstract void sleep();
}
class Bird extends Animal{
	void eat() {
		System.out.println("Birds are Eating");
	}
	void sleep() {
		System.out.println("Birds are sleeping");
	}
}
public class In1 {
	public static void main(String[] args) {
		Animal a1 = new Bird();
		System.out.println("Animal");
		a1.eat();
		a1.sleep();
		System.out.println("Birds");
		Bird b1 = new Bird();
		b1.eat();
		b1.sleep();
	}
}
