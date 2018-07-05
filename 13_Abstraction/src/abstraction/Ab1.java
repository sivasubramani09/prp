package abstraction;
abstract class GeneralBank{
	abstract void getSavingInterestRate();
	abstract void getFixedInterestRate();
}
class ICICIBank extends GeneralBank {
	void getSavingInterestRate(){
		System.out.println("Savings Interest Rate: 4%");
		}
	void getFixedInterestRate(){
		System.out.println("Fixed Interest Rate: 8.5%");
	}
	
}
class KotMBank extends GeneralBank{
	void getSavingInterestRate(){
		System.out.println("Savings Interest Rate: 6%");
		}
	void getFixedInterestRate(){
		System.out.println("Fixed Interest Rate: 9%");
	}

}
public class Ab1 {
	public static void main(String[] args) {
		ICICIBank ic = new ICICIBank();
		KotMBank km = new KotMBank();
		GeneralBank gi = new ICICIBank();
		GeneralBank gk = new KotMBank();
		ic.getSavingInterestRate();
		ic.getFixedInterestRate();
		km.getSavingInterestRate();
		km.getFixedInterestRate();
		gi.getSavingInterestRate();
		gi.getFixedInterestRate();
		gk.getSavingInterestRate();
		gk.getFixedInterestRate();
	}

}
