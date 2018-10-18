package threadCreation;

public class CreateTwoThreads extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		CreateTwoThreads c1 = new CreateTwoThreads();
		CreateTwoThreads c2 = new CreateTwoThreads();
		c1.setName("Scooby");
		c2.setName("Shaggy");
		c1.start();
		c2.start();
	}
}
