package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest_negativeQuotient {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
        assertEquals(-3.0, test.divide(15, -5), 0);
	}

}
