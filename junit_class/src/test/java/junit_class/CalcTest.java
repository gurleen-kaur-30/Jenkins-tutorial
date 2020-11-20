package junit_class;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


class CalcTest {
	Calc calculator = new Calc();
	@BeforeAll
	static void init() {
		System.out.println("hello everyone");
	}
	
	@Test
	void test_add() {
		int actual = calculator.add(1, 2);
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_sub() {
		int actual = calculator.subtract(2, 3);
		int expected = -1;
		assertEquals(expected,actual);
	}
}
