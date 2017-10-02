package com.algorithms.string;

public class DivisibilityBy3 {

	public static void main(String[] args) {
		String x = "1101";
		String res = "";
		for(int i=0;i<x.length();i++){
			res += x.charAt(i);
			System.out.println(Integer.parseInt(res,2));
			System.out.println(Integer.parseInt(res,2)%3 == 0);
		}

	}

}
