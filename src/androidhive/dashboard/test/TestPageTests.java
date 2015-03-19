package androidhive.dashboard.test;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;



import com.aptitudeguru.dashboard.TestPage;

public class TestPageTests extends TestCase{

	public TestPageTests() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFrench() 
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
	public void testAmerican()
	{
		TestPage test = new TestPage();
		String testVar = "rupee";
		String localeSign = "$";
		String localeCurrency = "dollar";
		String localeDistance = "miles";
		String localeDistancelong = "mph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeCurrency.equals(result));
	}
	
	public void testBritish()
	{
		TestPage test = new TestPage();
		String testVar = "rupee";
		String localeSign = "£";
		String localeCurrency = "pound";
		String localeDistance = "miles";
		String localeDistancelong = "mph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeCurrency.equals(result));
	}
	public void testHindi()
	{
		TestPage test = new TestPage();
		String testVar = "rupee";
		String localeSign = "rupee";
		String localeCurrency = "Rs";
		String localeDistance = "km";
		String localeDistancelong = "kmph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeCurrency.equals(result));
	}
}
