package com.algorithms.array;


public class LongestPrefixWithMaximumOccurancesIntheArray {

	public static void main(String args[]) {
//		int[] arr = { 4, 4, 6, 5, 4, 7, 5, 5, 4, 5, 3, 3, 5 };
		int[] arr = {6, 5, 4};
		int x = 4;
		int y = 5;
		int nx = 0;
		int ny = 0;
		int result = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == x){
				nx++;
			}
			if(arr[i] == y){
				ny++;
			}
			if(nx>0 && ny>0 && nx == ny){
				result = i;
			}
		}
		System.out.println(result);
	}
}
