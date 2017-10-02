package com.algorithms.string;

//https://leetcode.com/problems/container-with-most-water/description/
public class MaxAreaInContainer {

	public static void main(String[] args) {
		int[] height = {1,2,1,6,2,1,1,7};
		int left  = 0;
		int right = height.length -1;
		int max = Integer.MIN_VALUE;
		while(left<right){
			max = Math.max(max, (right-left)*(Math.min(height[right], height[left])));
			if(height[left]<height[right]){
				left++;
			}else{
				right--;
			}
		}
		System.out.println(max);
	}

}
