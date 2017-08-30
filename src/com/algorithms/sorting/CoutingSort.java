package com.algorithms.sorting;

import java.util.Arrays;

// Worst Case Time Complexity : O(n)
// Suitable for sorting numbers which are within the specified range
public class CoutingSort {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 4, 9, 3, 3, 3, 2, 1 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		int[] count = new int[max - min + 1];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		int[] res = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			res[--count[arr[i] - min]] = arr[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
