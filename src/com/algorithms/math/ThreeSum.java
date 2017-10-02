package com.algorithms.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		findCombinations(arr);
	}

	private static void findCombinations(int[] arr) {
		Set<List<Integer>> result = new HashSet<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-2; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				if (arr[i] + arr[j] + arr[k] == 0) {
					List<Integer> temp = new ArrayList<>();
					temp.add(arr[i]);
					temp.add(arr[j]);
					temp.add(arr[k]);
					result.add(temp);
					j++;
					k--;
					while (j < k && arr[j] == arr[j - 1]) {
						j++;
					}
					while (j < k && arr[k] == arr[k + 1]) {
						k--;
					}
				} else if (arr[i] + arr[j] + arr[k] < 0) {
					j++;
				} else {
					k--;
				}

			}
		}
		System.out.println(result);
	}
}
