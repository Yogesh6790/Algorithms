package com.algorithms.sorting;

import java.util.Arrays;

//Worst case Time Complexity : O(nlogn)
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 2, 9, 3, 5, 1, 6, 8 };
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr) {
		if (arr.length == 1){
			return;
		}
		int mid = (int) Math.ceil(Double.parseDouble(""+(arr.length / 2)));
		int[] leftArr = new int[mid];
		int[] rightArr = new int[arr.length - mid];
		System.arraycopy(arr, 0, leftArr, 0, mid);
		System.arraycopy(arr, mid, rightArr, 0, arr.length - mid);
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(arr, leftArr, rightArr);
	}

	private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int i = 0; // to track left array's index
		int j = 0; // to track right array's index
		int k = 0; // to track resultant array's index
		while (k < arr.length && i < leftArr.length && j < rightArr.length) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (k < arr.length && i < leftArr.length) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (k < arr.length && j < rightArr.length) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

}
