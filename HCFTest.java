package com.metacube.Recursion;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HCFTest {
	public int num1;
	public int num2;
	public int expectedResult;
	
	public HCFTest (int num1, int num2, int expectedResult) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
				{10, 15, 5},
				{35, 10, 5},
				{31, 2, 1}
		});
	}

	/*
	 * Testing LCM with above numbers
	 */
	@Test
	public void testHCF() {
		assertEquals(this.expectedResult, LCMHCF.calculateHCF(this.num1, this.num2));
	}
}
