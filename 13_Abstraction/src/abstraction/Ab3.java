package abstraction;

import java.util.Random;

abstract class Instrument{
	abstract void play();
}
class Piano extends Instrument{
	void play() {
		System.out.println("Piano is playing tan tan tan tan ");
	}
}
class Flute extends Instrument{
	void play(){
		System.out.println("Flute is playing toot toot toot");
	}
}
class Guitar extends Instrument{
	void play() {
		System.out.println("Guitar is playing tinn tin tin");
	}
}
public class Ab3 {
	public static void main(String[] args) {
		Instrument in[] = new Instrument[10];
		Random rnd = new Random();
		for(int i=0;i<in.length;i++) {
			int rNo = rnd.nextInt(3);
			switch(rNo) {
			case 0 : in[i] = new Piano(); break;
			case 1 : in[i] = new Flute(); break;
			case 2 : in[i] = new Guitar(); break;
			}
			System.out.print(in[i]+" ");
			System.out.println(in[i] instanceof Instrument);
			in[i].play();
			System.out.println();
		}
		
	}
	
}
