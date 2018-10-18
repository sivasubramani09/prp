package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalinCheck {
	Palin p1 = new Palin();
	@Test
	public void testPalin() {
		assertEquals(true,p1.palindromeCheck("madam"));
		assertEquals(false,p1.palindromeCheck("Siva"));
	}
}
