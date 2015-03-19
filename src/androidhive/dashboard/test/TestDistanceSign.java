package androidhive.dashboard.test;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import com.aptitudeguru.dashboard.TestPage;

public class TestDistanceSign extends TestCase{

	public TestDistanceSign(){
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFrenchDistanceSign() 
	{
		TestPage test = new TestPage();
		String testVar = "kmph";
		String localeSign = "€";
		String localeCurrency = "euro";
		String localeDistancelong = "km";
		String localeDistance = "kmph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeDistance.equals(result));
	}
	@Test
	public void testAmericanDistanceSign()
	{
		TestPage test = new TestPage();
		String testVar = "kmph";
		String localeSign = "$";
		String localeCurrency = "dollar";
		String localeDistancelong = "miles";
		String localeDistance = "mph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeDistance.equals(result));
	}
	@Test
	public void testBritishDistanceSign()
	{
		TestPage test = new TestPage();
		String testVar = "kmph";
		String localeSign = "£";
		String localeCurrency = "pound";
		String localeDistancelong = "miles";
		String localeDistance = "mph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeDistance.equals(result));
	}
	@Test
	public void testHindiDistanceSign()
	{
		TestPage test = new TestPage();
		String testVar = "kmph";
		String localeSign = "rupee";
		String localeCurrency = "Rs";
		String localeDistancelong = "km";
		String localeDistance = "kmph";
		String result = test.getLocaleCurrency(testVar, localeSign, localeCurrency, localeDistance, localeDistancelong);
		assertTrue(localeDistance.equals(result));
	}

}
