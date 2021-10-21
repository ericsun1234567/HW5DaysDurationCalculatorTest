import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DaysDurationCalculatorTest {

	@Test
	void sameDayTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(1, 1, 1, 1, 2021);
		assertEquals(0,result);
	}
	
	
	@Test
	void sameDayLeapYearTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(2, 29, 2, 29, 2021);
		assertEquals(0,result);
	}
	
	
	
	@Test
	void bothNoValuesTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(0, 0, 0, 0, 0);
		assertEquals(0,result);
	}
	
	
}
