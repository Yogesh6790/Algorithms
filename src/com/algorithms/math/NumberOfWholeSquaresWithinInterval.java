package com.algorithms.math;

public class NumberOfWholeSquaresWithinInterval {

	public static void main(String[] args) {
		double start = 9;
		double end = 99;
		int startSqrtVal = (int) Math.ceil(Math.sqrt(start));
		int endSqrtVal = (int) Math.floor(Math.sqrt(end));
		System.out.println(startSqrtVal);
		System.out.println(endSqrtVal);
		System.out.println(endSqrtVal - startSqrtVal + 1);
	}
}
