package com.algorithms.string;

public class Permutation {

	public static void main(String[] args) {
		String x = "abc";
		permute(x,"", x.length());
	}

	private static void permute(String x, String string, int length) {
		if(string.length() == length){
			System.out.println(string);
			return;
		}
		for(int i=0;i<x.length();i++){
			permute(x.substring(0,i)+x.substring(i+1),string+x.charAt(i),length);
		}
	}

}
