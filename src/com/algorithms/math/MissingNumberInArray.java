package com.algorithms.string;

import java.util.List;
import java.util.ArrayList;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr  ={ 1, 2, 3, 4, 6, 8, 7, 4};
		List<Integer> list = new ArrayList<>();
		int duplicate = -1;
		for(int i = 0;i < arr.length; i++){
			if(list.contains(arr[i])){
				duplicate = arr[i];
			}
			list.add(arr[i]);
		}
		System.out.println("Duplicate "+duplicate);
//		for(int i = 0;i < arr.length; i++){
//			System.out.println();
//			System.out.println(arr[i]);
//			System.out.println(list.indexOf(arr[i]));
//			System.out.println(list.lastIndexOf(arr[i]));
//		}
		
		for(int i = 1 ;i <= arr.length; i++){
			if(!list.contains(i)){
				System.out.println("Missing "+i);
			}
		}
		
	}

}
