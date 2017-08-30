package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

//Expected worst Case Time complexity : O(nlogn)
public class RandomizedQuickSort {

	public static void main(String[] args) {
		int[] arr = { 7, 4, 2, 9, 3, 5, 1, 6, 8 };
		performQuickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void performQuickSort(int[] arr, int start, int end) {
		if(start<end){
			int pIndex = quickSort(arr,start,end);
			performQuickSort(arr,start,pIndex-1);
			performQuickSort(arr,pIndex+1,end);
		}

	}

	private static int quickSort(int[] arr, int start, int end) {
		int pIndex = start;
		
		//generate random index and move it to the end
		int random = new Random().nextInt(end-start+1) + start;
		int temp = arr[random];
		arr[random] = arr[end];
		arr[end] = temp;
		int pivot = arr[end];
		
		for (int i = start; i <= end; i++) {
			if (arr[i] < pivot) {
				temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		temp = arr[pIndex];
		arr[pIndex] = pivot;
		arr[end] = temp;
		return pIndex;
	}

}
