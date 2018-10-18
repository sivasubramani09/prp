package threadControlAndPriorities;
/*
 * Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time.
 * Observe the completion of the threads.
 * */
public class ThreadPriority implements Runnable{
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadPriority(),"One");
		Thread t2 = new Thread(new ThreadPriority(),"Two");
		Thread t3 = new Thread(new ThreadPriority(),"Three");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" , "+i);
		}
	}
}
