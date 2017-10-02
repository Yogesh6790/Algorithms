package com.algorithms.string;

public class UniqueCharacters {

	public static void main(String[] args) {
		String test = "abcdefa";
		String test1 = "abcde";
		System.out.println(isUniqueChars(test));
		System.out.println(isUniqueChars(test1));
	}

	private static boolean isUniqueChars(String str) {
		int checker = 0;
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i) - 'a';
			int shiftedVal = 1 << val;
			if((checker & shiftedVal) > 0){
				return false;
			}
			checker |= shiftedVal;
		}
		return true;
	}

}
