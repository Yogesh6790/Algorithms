package com.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Worst case Time Complexioty : O(number of elements * number of bits in elements)
public class RadixSort {

	public static void main(String[] args) {
		int[] arr = { 7, 44, 43, 99, 31, 38, 3, 29, 100 };
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			max = Math.max(arr[i], max);
		}
		int maxLength = String.valueOf(max).length();
		String[] strArr = new String[arr.length];
		Map<String,Integer> map = new HashMap<>();
		for(int i = 0;i<arr.length;i++){
			strArr[i] = String.format("%0"+maxLength+"d", arr[i]);
			map.put(strArr[i], arr[i]);
		}
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(strArr));
		for(int j = maxLength-1; j>=0; j--){
			List<List<String>> buckets = new ArrayList();
			buckets.add(new ArrayList<String>());
			buckets.add(new ArrayList<String>());
			buckets.add(new ArrayList<String>());
			buckets.add(new ArrayList<String>());
			buckets.add(new ArrayList<String>());
			buckets.add(new ArrayList<String>());
			buckets.add(new ArrayList<String>());
			buckets.add(new ArrayList<String>());
			buckets.add(new ArrayList<String>());
			buckets.add(new ArrayList<String>());
			for(int i=0;i<strArr.length;i++){
				buckets.get(Integer.parseInt(""+strArr[i].charAt(j))).add(strArr[i]);
			}
			int index = 0;
			for(int i =0; i<10; i++){
				if(buckets.get(i).size() != 0){
					for(int k = 0;k<buckets.get(i).size();k++){
						strArr[index] = buckets.get(i).get(k).toString();
						index++;
					}
				}
			}
		}
		
		System.out.println();
		System.out.println("After sorting");
		for(int i=0;i<strArr.length;i++){
			arr[i] = map.get(strArr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

}
