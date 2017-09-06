package com.algorithms.array;

import java.util.Scanner;

public class WindowWithMaximumSum_KadanesAlgorithm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			int finalMax = Integer.MIN_VALUE;
			int currentSum = 0;
			for (int i = 0; i < n; i++) {
				if (currentSum + arr[i] < 0) {
				    currentSum = 0;
					finalMax = Math.max(finalMax, arr[i]);
				} else {
					currentSum += arr[i];
					finalMax = Math.max(finalMax, currentSum);
				}
			}
			System.out.println(finalMax);
			t--;
		}
	}
}
