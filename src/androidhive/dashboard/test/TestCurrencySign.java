package androidhive.dashboard.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import com.aptitudeguru.dashboard.TestPage;

public class TestCurrencySign extends TestCase{

	public TestCurrencySign() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFrenchCurrencySign() 
	{
		TestPage test = new TestPage();
		String testVar = "Rs";
		String localeSign = "€";
		String localeCurrency = "euro";
		String localeDistancelong = "km";
		String localeDistance = "kmph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeSign.equals(result));
	}
	@Test
	public void testAmericanCurrencySign()
	{
		TestPage test = new TestPage();
		String testVar = "Rs";
		String localeSign = "$";
		String localeCurrency = "dollar";
		String localeDistancelong = "miles";
		String localeDistance = "mph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeSign.equals(result));
	}
	@Test
	public void testBritishCurrencySign()
	{
		TestPage test = new TestPage();
		String testVar = "Rs";
		String localeSign = "£";
		String localeCurrency = "pound";
		String localeDistancelong = "miles";
		String localeDistance = "mph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeSign.equals(result));
	}
	@Test
	public void testHindiCurrencySign()
	{
		TestPage test = new TestPage();
		String testVar = "Rs";
		String localeSign = "Rs";
		String localeCurrency = "rupee";
		String localeDistancelong = "km";
		String localeDistance = "kmph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeSign.equals(result));
	}

}

