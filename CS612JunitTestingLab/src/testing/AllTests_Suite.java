package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ countTest.class, divideTest_denominatorZero.class, divideTest_negativeQuotient.class,
		divideTest_positiveQuotient.class, squareTest.class })
public class AllTests_Suite {

}
