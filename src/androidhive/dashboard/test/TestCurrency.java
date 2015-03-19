package androidhive.dashboard.test;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aptitudeguru.dashboard.TestPage;

public class TestCurrency extends TestCase{

	public TestCurrency() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFrenchCurrency() 
	{
		TestPage test = new TestPage();
		String testVar = "rupee";
		String localeSign = "€";
		String localeCurrency = "euro";
		String localeDistance = "km";
		String localeDistancelong = "kmph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeCurrency.equals(result));
	}
	@Test
	public void testAmericanCurrency()
	{
		TestPage test = new TestPage();
		String testVar = "rupee";
		String localeSign = "$";
		String localeCurrency = "dollar";
		String localeDistancelong = "miles";
		String localeDistance = "mph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeCurrency.equals(result));
	}
	@Test
	public void testBritishCurrency()
	{
		TestPage test = new TestPage();
		String testVar = "rupee";
		String localeSign = "£";
		String localeCurrency = "pound";
		String localeDistancelong = "miles";
		String localeDistance = "mph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeCurrency.equals(result));
	}
	@Test
	public void testHindiCurrency()
	{
		TestPage test = new TestPage();
		String testVar = "rupee";
		String localeSign = "rupee";
		String localeCurrency = "Rs";
		String localeDistancelong = "km";
		String localeDistance = "kmph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeCurrency.equals(result));
	}
}
