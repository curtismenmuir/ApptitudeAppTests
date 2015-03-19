package androidhive.dashboard.test;
import com.aptitudeguru.dashboard.TestPage;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({ 
	TestCurrency.class, TestDistance.class, TestDistanceSign.class, TestCurrencySign.class
	})
public class AllTests {

}

