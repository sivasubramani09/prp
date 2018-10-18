package threadCreation;

import java.util.Random;

public class StopAtRed implements Runnable {
	public static void main(String[] args) {
		StopAtRed s1 = new StopAtRed();
		Thread t1 = new Thread(s1);
		t1.start();
	}

	@Override
	public void run() {
		Random rnd = new Random();
		String colors[]={"white","blue","black","green","red","yellow"};
		int i=0;
		while(!(colors[i].equals("red"))) {
			i = rnd.nextInt(colors.length);
			System.out.println(colors[i]);
		}
		Thread.interrupted();
	}
}
