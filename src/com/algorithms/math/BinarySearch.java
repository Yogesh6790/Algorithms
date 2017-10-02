package com.algorithms.string;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		int[] arr1 = new int[]{1,2,3,4};
		binarySearch(arr,0,arr.length-1,3);
		binarySearch(arr1,0,arr1.length-1,2);
	}

	private static void binarySearch(int[] arr, int start, int end, int target) {
		if(start<= end){
			int mid = (start+end)/2;
			if(arr[mid] == target){
				System.out.println(mid);
			}else if(arr[mid] <= target){
				binarySearch(arr,start,mid-1,target);
			}else{
				binarySearch(arr,mid+1,end,target);
			}
		}
	}

}
