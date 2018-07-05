package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	public static void main(String[] args) {
		Veena v = new Veena();
		Saxophone sx = new Saxophone();
		v.play();
		sx.play();
		Playable p = v;
		p.play();
		Playable p1 = sx;
		p1.play();
	}
}
