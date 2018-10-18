package threadControlAndPriorities;
/*
 * Create two threads, one thread to display all even numbers between 1 & 20,
 * another to display odd numbers between 1 & 20.
 * Note: Display all even numbers followed by odd numbers
 * Hint: use join
 * */
public class EvenWithOdd implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			if(Thread.currentThread().getName().equals("odd")) {
				if(i%2==1)
				System.out.println(i);
			}
			if(Thread.currentThread().getName().equals("even")) {
				if(i%2==0)
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		EvenWithOdd ewo1 = new EvenWithOdd();
		Thread odd = new Thread(ewo1,"odd");
		EvenWithOdd ewo2 = new EvenWithOdd();
		Thread even = new Thread(ewo2,"even");
		even.start();
		even.join();
		odd.start();
	}
}
