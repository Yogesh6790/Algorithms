package com.algorithms.math;

public class SquareRootOfaNumber {

	public static void main(String[] args) {
		
		System.out.println(99);	
		System.out.println(findSquareRoot(1,99,"floor"));
		System.out.println(findSquareRoot(1,99,"ceil"));
		System.out.println();
		System.out.println(64);
		System.out.println(findSquareRoot(1,64,"floor"));
		System.out.println(findSquareRoot(1,64,"ceil"));
		System.out.println();
		System.out.println(37);
		System.out.println(findSquareRoot(1,37,"floor"));
		System.out.println(findSquareRoot(1,37,"ceil"));
		System.out.println();
		System.out.println(40);
		System.out.println(findSquareRoot(1,40,"floor"));
		System.out.println(findSquareRoot(1,40,""));
	}

	private static int findSquareRoot(int start, int number, String type) {
		int res = 0;
		int end = number;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (mid * mid == number) {
				return mid;
			} else if (mid * mid < number) {
				start = mid + 1;
				if(type.equals("floor")){
					res = mid;	
				}
			} else {
				end = mid - 1;
				if(type.equals("ceil")){
					res = mid;	
				}
			}
		}
		return res;
	}
	
}
