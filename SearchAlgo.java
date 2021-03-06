package com.metacube.Recursion;

import java.util.*;

public class SearchAlgo {
	/*
	 * Searches value in given array linearly using recursion
	 * 
	 * @param array
	 * 
	 * @param value
	 * 
	 * @return index of item if present else -1
	 */
	public static int linearSearch(int[] array, int value) {
		int length = array.length;
		if (array.length == 0) {
			return -1;
		} else if (array[length - 1] == value) {
			return length - 1;
		}
		int[] newArray = Arrays.copyOfRange(array, 0, length - 1);
		return linearSearch(newArray, value);
	}

	/*
	 * Searches value in given array through binary search using recursion
	 * 
	 * @param array
	 * 
	 * @param value
	 * 
	 * @return index of item if present else -1 Note:- assuming that given array
	 * is sorted
	 */
	public static int binarySearch(int[] array, int value,
			int firstIndex, int lastIndex) {

		// getting middle index
		int mid = firstIndex + (lastIndex - firstIndex) / 2;

		if (lastIndex >= firstIndex) {
			if (array[mid] == value) {
				return mid;
			}
			if (array[mid] > value) {
				return binarySearch(array, value, firstIndex, mid - 1);
			} else {
				return binarySearch(array, value, mid + 1, lastIndex);
			}
		}
		return -1;
	}

}
