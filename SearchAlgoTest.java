package com.metacube.Recursion;
import static org.junit.Assert.*; 

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SearchAlgoTest {
	public int[] array;
	public int value;
	public int expected;
	
	public SearchAlgoTest (int[] array, int value, int expected) {
		this.array = array;
		this.value = value;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> testValues() {
		return Arrays.asList(new Object[][]{
			{new int[]{1, 2, 6, 9, 14, 24}, 1, 0},      // checking first position
			{new int[]{1, 2, 6, 9, 14, 24}, 24, 5},     // checking last position
			{new int[]{-10, -9, 1, 9, 10, 24}, 9, 3},   // checking middle position
			{new int[]{1, 2, 6, 9, 14, 24}, 2, 1},      // checking second position
			{new int[]{1, 2, 6, 9, 14, 24}, 14, 4},     // checking second last position
			{new int[]{-10, -9, 1, 9, 10, 24}, 90, -1}, // element not found
			{new int[]{}, 24, -1}                       // empty array
		});
	}
	
	/*
	 * Testing with multiple arrays with Linear Search
	 */
	@Test
	public void testLinearSearch() {
		assertEquals(this.expected, SearchAlgo.linearSearch(this.array, this.value));
	}
	
	/*
	 * Testing with multiple arrays with Binary Search
	 */
	@Test
	public void testBinarySearch() {
		assertEquals(this.expected, SearchAlgo.binarySearch(this.array, this.value, 0, this.array.length - 1));
	}
}
