package com.metacube.Recursion;

public class LCMHCF {
	/*
	 * calculate GCD of given numbers
	 * @param num1
	 * @param num2
	 * @return GCD of num1 and num2
	 * NOTE:- assuming both numbers are positive
	 */
	public static int calculateGCD(int num1, int num2) {
		if (num1 == 0)
			return num2;
		return calculateGCD(num2 % num1, num1);
	}
	
	/*
	 * calculate LCM of given numbers
	 * @param num1
	 * @param num2
	 * @return LCM of num1 and num2
	 * NOTE:- assuming both numbers are positive
	 */
	public static int calculateLCM(int num1, int num2) {
		return ((num1 / calculateGCD(num1, num2)) * num2);
	}
	
	/*
	 * calculate HCF of given numbers
	 * @param num1
	 * @param num2
	 * @return HCF of num1 and num2
	 * NOTE:- assuming both numbers are positive
	 */
	public static int calculateHCF(int num1, int num2) {
		if (num1 == 0)
			return num2;
		if (num2 == 0)
			return num1;
		if (num1 > num2) {
			return calculateHCF(num1 % num2, num2);
		} else {
			return calculateHCF(num2 % num1, num1);
		}
}
	
	public static void main(String...arg)
	{
		
		System.out.println(calculateHCF(10, 5));
		System.out.println(calculateLCM(25, 60));
		System.out.println(calculateGCD(10, 5));
	}
}

