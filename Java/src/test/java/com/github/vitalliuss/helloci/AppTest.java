package com.github.vitalliuss.helloci;


import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit test for simple App.
 * @author vitali_shulha
 */
public class AppTest {
	@Rule
	public ExpectedException thrown= ExpectedException.none();

	@Test
	public void testShoudBePassed() {
		assertTrue(true);
	}

	@Test
	public void testShouldBeFailed() {
		assertTrue(false);
	}

	@Ignore("Not implemented yet, but at least started!!!")
	@Test
	public void testShouldBeSKipped() {
		assertTrue(true);
	}
	
	@Test
	public void testAnotherMethod() {
		App.doNothing();
	}
	
	@Test
	public void testAnotherClass() {
		EmptyClass.emptyMethod();
	}

	@Test
	public void testDivisionByZeroShouldThrowException(){
		thrown.expect(ArithmeticException.class);
		//remove comment for the below row to get better failure report
		//thrown.reportMissingExceptionWithMessage("Division by zero should throw ArithmeticException");
		EmptyClass.myDivide(2,0);
	}
}
