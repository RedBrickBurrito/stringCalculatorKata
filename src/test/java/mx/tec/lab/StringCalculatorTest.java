package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	
	StringCalculator calculator = new StringCalculator();
	
	@Test
	void testGivenCalculatorWhenAddEmptyStringThen0() {
		int expectedResult = 0;
		String numbers = "";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testGivenCalculatorWhenAdd1Then1() {
		int expectedResult = 1;
		String numbers = "1";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}
	@Test
	void testGivenCalculatorWhenAdd1Comma2Then3() {
		int expectedResult = 3;
		String numbers = "1,2";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testGivenCalculatorWhenAdd1_2_4_4_2NumbersThen13() {
		int expectedResult = 13;
		String numbers = "1,2,4,4,2";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testGivenCalculatorWhenAdd1NewLine2Comma3Then6() {
		int expectedResult = 6;
		String numbers = "1\n2,3";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testWhenAddSlashSlashSemiColonNewLine1SemiColon2Then3() {
		int expectedResult = 3;
		String numbers = "//;\n1;2";
		
		int actualResult = calculator.add(numbers);
		assertEquals(expectedResult, actualResult);
	}

}
