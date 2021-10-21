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
	void sameMonthTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(2, 2, 2, 12, 2021);
		assertEquals(10,result);
	}
	
	@Test
	void differentMonthTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(2, 2, 3, 12, 2021);
		assertEquals(38,result);
	}
	
	
	@Test
	void sameDayLeapYearTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(2, 29, 2, 29, 2021);
		assertEquals(0,result);
	}
	
	@Test
	void sameMonthLeapYearTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(2, 1, 2, 29, 2021);
		assertEquals(28,result);
	}
	
	@Test
	void differentMonthLeapYearTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(2, 2, 3, 12, 2020);
		assertEquals(39,result);
	}
	
	
	@Test
	void bothNoValuesTest() {
		DaysDurationCalculator a = new DaysDurationCalculator();
		int result = a.cal(0, 0, 0, 0, 0);
		assertEquals(0,result);
	}
	
	
}
