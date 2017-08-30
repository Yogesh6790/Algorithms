package com.algorithms.sorting;

import java.util.Arrays;

//Worst Case Time complexity : O(n^2)
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 2, 9, 3, 5, 1, 6, 8 };
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
