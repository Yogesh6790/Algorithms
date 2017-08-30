package com.algorithms.sorting;

import java.util.Arrays;

//Worst Case Time complexity : O(n^2)
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 2, 9, 3, 5, 1, 6, 8 };
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++){
				// bubbling in the right
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
