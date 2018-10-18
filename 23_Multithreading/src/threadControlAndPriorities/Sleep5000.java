package threadControlAndPriorities;
/*
 * Create a thread which prints 1 to 10. After printing 5,
 * there should be a delay of 5000 milliseconds before printing 6
 * */
public class Sleep5000 implements Runnable{

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==5)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	public static void main(String[] args) {
		Sleep5000 s1 = new Sleep5000();
		Thread t1 = new Thread(s1);
		t1.start();
	}
}
