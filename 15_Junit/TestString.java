package junit;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestString {
	StringConcatenation s1 = new StringConcatenation();
	@Test
	public void testConcat(){
		assertEquals("ComputerScience",s1.stringConcat("Computer", "Science"));
	}

}
