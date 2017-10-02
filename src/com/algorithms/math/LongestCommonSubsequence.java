package com.algorithms.string;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "abcdaf";
		String s2 = "acbcf";
		int[][] arr = new int[s2.length() + 1][s1.length() + 1];
		for (int i = 1; i <= s2.length(); i++) {
			for (int j = 1; j <= s1.length(); j++) {
				if (s2.charAt(i-1) == s1.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1] + 1;
				} else {
					arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
				}
			}
		}
		System.out.println(arr[s2.length()][s1.length()]);
		//get sequence
		int i = s2.length();
		int j = s1.length();
		String subSequence= "";
		while (i > 0 && j > 0) {
			if (arr[i][j] == arr[i][j - 1]) {
				j--;
			} else if (arr[i][j] == arr[i - 1][j]) {
				i--;
			}else{
				subSequence = s2.charAt(i-1)+ subSequence;
				i--;
				j--;
			}
		}
		System.out.println(subSequence);
	}

}
