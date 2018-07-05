package twowheeler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HondaTesting {
	Honda ho = new Honda();
	@Test
	void testSpeed() {
		assertEquals(0,ho.getSpeed());
	}
	@Test
	void testModelName() {
		assertEquals("Honda",ho.getModelName());
	}
	@Test
	void testOwnerName() {
		assertEquals("Siva",ho.getOwnerName());
	}
	@Test
	void testRegistrationNumber() {
		assertEquals("TN28A5678",ho.getRegistrationNumber());
	}	

}
