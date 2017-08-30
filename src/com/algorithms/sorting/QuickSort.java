package com.algorithms.sorting;

import java.util.Arrays;

//Worst Case Time complexity : O(n^2)
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 2, 9, 3, 5, 1, 6, 8 };
		performQuickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void performQuickSort(int[] arr, int start, int end) {
		if(start<end){
			int pIndex = quickSort(arr, start, end);
			performQuickSort(arr, start, pIndex - 1);
			performQuickSort(arr, pIndex+1, end);
		}
	}

	private static int quickSort(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pIndex = start;
		for (int i = start; i <= end - 1; i++) {
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = arr[pIndex];
		arr[pIndex] = pivot; //arr[end]
		arr[end] = temp;
		return pIndex;
	}

}
