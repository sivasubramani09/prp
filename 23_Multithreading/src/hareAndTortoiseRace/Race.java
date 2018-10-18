package hareAndTortoiseRace;

public class Race implements Runnable{
	int flag = 0;
	//Pending 
	// 30/07/2018
	@SuppressWarnings("static-access")
	@Override
	public void run()  {
		for(int i=1;i<=100;i++) {
			if(i==61 && Thread.currentThread().getName().equals("Hare")) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(flag == 1) {
				Thread.currentThread().interrupted();
			}
			if(i==100) {
				flag = 1;
				Thread.interrupted();
			}
			System.out.println(i+","+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Race r1 = new Race();
		Race r2 = new Race();
		Thread t1 = new Thread(r1,"Hare");
		Thread t2 = new Thread(r2,"Tortoise");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
