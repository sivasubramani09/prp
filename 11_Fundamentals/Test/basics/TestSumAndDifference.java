package basics;
import org.junit.Test;

import basics.SumAndDifference;

import org.junit.Assert;

public class TestSumAndDifference {
	@Test
	public void testSum() {
		SumAndDifference s1 = new SumAndDifference();
		double result = s1.sum(20, 30);
		Assert.assertEquals(50, result,0);
	}
	@Test
	public void testDiff() {
		SumAndDifference s2 = new SumAndDifference();
		double resultDiff = s2.diff(30, 20);
		Assert.assertEquals(10, resultDiff,0);		
	}
}
