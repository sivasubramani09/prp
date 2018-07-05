package twowheeler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HeroTesting {

		Hero h1 = new Hero();
		@Test
		void testSpeed() {
			assertEquals(0,h1.getSpeed());
		}
		@Test
		void testModelName() {
			assertEquals("Hero",h1.getModelName());
		}
		@Test
		void testOwnerName() {
			assertEquals("Dilip",h1.getOwnerName());
		}
		@Test
		void testRegistrationNumber() {
			assertEquals("TN28A1234",h1.getRegistrationNumber());
		}	
		/*@Test
		void test() {
			fail("Not yet implemented");
		}*/

	

}
