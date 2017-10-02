package com.algorithms.string;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		//1 2 3 4 6 6 8 10
		 int ar1[] = {1,2,3,4,5, 6,7,8,9,10};
		 int ar2[] = {16,17,18,19,20,21,22,23,24,25};
		 double median = 0;
		 int k = ar1.length + ar2.length;
//		 if(k % 2 == 0){
//			 median = (findkthElem(ar1,ar2,0,ar1.length-1,0, ar2.length-1)+ findkthElem(ar1,ar2,0,ar1.length-1,0, ar2.length-1)) / 2;
//		 }else{
			 median = findkthElem(ar1,ar2,0,ar1.length-1,0, ar2.length-1);
//		 }
			 System.out.println(median);
	}

	private static double findkthElem(int[] ar1, int[] ar2, int s1,int e1, int s2, int e2) {
		if(e1-s1 == 1 && e2-s2 == 1){
			return 1.0*(Math.max(ar1[s1], ar2[s2]) + Math.min(ar1[e1], ar2[e2]))/2;
		}
		
		int m1_index = ( s1 + e1 )/2;
		int m2_index = ( s2 + e2 )/2;
		int m1 = ar1[m1_index];
		int m2 = ar2[m2_index];
		System.out.println("***1***");
		System.out.println(s1);
		System.out.println(e1);
		System.out.println(m1_index);
		System.out.println(m1);
		System.out.println("****2**");
		System.out.println(s2);
		System.out.println(e2);
		System.out.println(m2_index);
		System.out.println(m2);
		if(m1 == m2){
			return m1;
		}
		if(m1<m2){
			if(e1 - m1_index>=1){
				s1 = m1_index;
			}
			if(m2_index - s2>=1){
				e2 = m2_index;
			}
		}else{
			if(m1_index - s1 >= 1){
				e1 = m1_index;
			}
			if(e2 - m2_index >= 1){
				s2 = m2_index;			
			}
		}
		return findkthElem(ar1,ar2,s1,e1,s2, e2);
	}

}
