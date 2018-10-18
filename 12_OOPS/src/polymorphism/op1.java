package polymorphism;
class Fruit{
	String name;
	String taste;
	String size;
	void eat() {}
}
class Apple extends Fruit{
	void eat() {
		System.out.println("Apple fruit is crunchy");
	}
}
class Orange extends Fruit{
	void eat() {
		System.out.println("Orange fruit is pulpy");
	}
}
public class op1 {
	public static void main(String[] args) {
		Fruit f1 = new Apple();
		Fruit f2 = new Orange();
		f1.eat();
		f2.eat();
	}
}
