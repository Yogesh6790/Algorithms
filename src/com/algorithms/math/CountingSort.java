package com.algorithms.string;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr  = {5,3,1,2,1};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++){
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		int[] count = new int[max+1];
		for(int i = 0;i<arr.length;i++){
			count[arr[i]]++;
		}
		for(int i=min;i<=max;i++){
			count[i] += count[i-1];
		}
		int[] res = new int[arr.length];
		for(int i = arr.length-1; i>=0; i--){
			res[--count[arr[i]]] = arr[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
