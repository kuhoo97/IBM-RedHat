package com.example.junit_assertions_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator= new Calculator();
	
	@Test
	public void testAddition() {
		
		assertEquals(6, calculator.addition(3,3));
	}
	
	@Test
	public void testSubtraction() {
		
		assertEquals(6, calculator.subtraction(9,3));
	}
	
	@Test
	public void testMultiplication() {
		
		assertEquals(4, calculator.multiplication(2,2));
	}
	
	@Test
	public void testDivision() {
		
		assertEquals(4, calculator.multiplication(8,2));
	}
	
	
}
