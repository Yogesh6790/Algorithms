package com.algorithms.dynammicprogramming;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/sherlock-and-cost
public class MaximumSumOfDifferenceBetweenAdjcentElems {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = in.nextInt();
			}
			int low = 0;
			int high = 0;
			for (int i = 1; i < n; i++) {
				int low_to_high_diff = Math.abs(b[i] - 1);
				int high_to_low_diff = Math.abs(b[i - 1] - 1);
				int high_to_high_diff = Math.abs(b[i] - b[i - 1]);
				int low_now = high + high_to_low_diff;
				int high_now = Math.max(high + high_to_high_diff, low
						+ low_to_high_diff);
				low = low_now;
				high = high_now;
			}
			System.out.println(Math.max(low, high));
			t--;
		}
	}
}
