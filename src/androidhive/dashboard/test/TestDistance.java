package androidhive.dashboard.test;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aptitudeguru.dashboard.TestPage;

public class TestDistance extends TestCase{

	public TestDistance() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFrenchDistance() 
	{
		TestPage test = new TestPage();
		String testVar = "10 km an hour";
		String localeSign = "€";
		String localeCurrency = "euro";
		String localeDistancelong = "km";
		String localeDistance = "kmph";
		String finalRes = "10 km an hour";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(finalRes.equals(result));
	}
	@Test
	public void testAmericanDistance()
	{
		TestPage test = new TestPage();
		String testVar = "10 km an hour";
		String localeSign = "$";
		String localeCurrency = "dollar";
		String localeDistancelong = "miles";
		String localeDistance = "mph";
		String finalRes = "10 miles an hour";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(finalRes.equals(result));
	}
	@Test
	public void testBritishDistance()
	{
		TestPage test = new TestPage();
		String testVar = "10 km an hour";
		String localeSign = "£";
		String localeCurrency = "pound";
		String localeDistancelong = "miles";
		String localeDistance = "mph";
		String finalRes = "10 miles an hour";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(finalRes.equals(result));
	}
	@Test
	public void testHindiDistance()
	{
		TestPage test = new TestPage();
		String testVar = "10 km an hour";
		String localeSign = "rupee";
		String localeCurrency = "Rs";
		String localeDistancelong = "km";
		String localeDistance = "kmph";
		String finalRes = "10 km an hour";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(finalRes.equals(result));
	}

}
