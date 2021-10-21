import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DaysDurationCalculatorTest {

	
	
	@Test
	void bothNoValuesTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(0, 0, 0, 0, 0);
		assertEquals(0,result);
	}
	
	
}
