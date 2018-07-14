package junit;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {
	@Test
	public void test() {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Soundarrajan");
	list.add("Sivasubramani");
	assertEquals("FOUND", new Employee().findName(list, "Sivasubramani"));
	}
	@Test
	public void test2() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Jonathan");
		list.add("Krishnan");
		assertEquals("NOT FOUND", new Employee().findName(list, "RaghuRam"));
	}

}
