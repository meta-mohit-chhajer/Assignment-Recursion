package com.metacube.Recursion;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class LCMTest {
	public int num1;
	public int num2;
	public int expectedResult;
	
	public LCMTest(int num1, int num2, int expectedResult) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
				{15, 20, 60},
				{5, 7, 35},
				{20, 42, 420}
		});
	}
	
	/*
	 * Testing LCM with above numbers
	 */
	@Test
	public void testLCM() {
		assertEquals(this.expectedResult, LCMHCF.calculateLCM(this.num1, this.num2));
	}
}
