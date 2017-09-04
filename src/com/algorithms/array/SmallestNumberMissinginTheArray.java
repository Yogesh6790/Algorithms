package com.algorithms.array;

import java.util.HashMap;
import java.util.Map;

//
public class SmallestNumberMissinginTheArray {

	public static void main(String[] args) {
		int[] A = {-1,-3};
        Map<Integer,Boolean> map  = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i =0; i< A.length; i++){
            map.put(A[i],true);
            max = Math.max(max,A[i]);
        }
        int res = 1;
        for(int i = 1; i<=max+1; i++){
            if(!map.containsKey(i)){
                res = i;
                break;
            }
        }
       System.out.println(res);
	}

}
