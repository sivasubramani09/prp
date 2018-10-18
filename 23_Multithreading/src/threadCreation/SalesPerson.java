package threadCreation;

class Days  extends Thread{
	@Override
	public void run() {
		SalesPerson s1 = new SalesPerson();
		s1.start();
		
		String[] day = new String[]{"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		for(int i =0;i<day.length;i++) {
			if(day[i].equals("sunday")){
				s1.suspend();
			}
			if(day[i].equals("wednesday")) {
				s1.resume();
			}
			//else {
				System.out.print(day[i]+",");
			//}
		}
	}
}
public class SalesPerson extends Thread {
	@Override
	public void run() {
		String salespersons = "Siva, Sakthi, Raghunath, Ramesh, Kabali";
		System.out.println("\n"+salespersons);
	}
	public static void main(String[] args) {
		Days d1 = new Days();
		d1.start();
	}
}
