package com.algorithms.string;

//Worst Case Time Complexity : O(n^2)
public class LongestPalindromicSubstring {

	private static String longestSubString = "";
	public static void main(String[] args) {
		String str = "babad";
		for(int i=0;i<str.length();i++){
			palindrome(i,str);
		}
		System.out.println(longestSubString);
	}

	private static void palindrome(int index, String str) {
		int begin = index;
		int end = index;
		while (begin >= 0 && end <= str.length() - 1
				&& str.charAt(begin) == str.charAt(end)) {
			longestSubString = str.substring(begin,end+1).length() > longestSubString.length() ? str.substring(begin,end+1) : longestSubString; 
			begin--;
			end++;
		}
		
		begin = index;
		end = index+1;
		while (begin >= 0 && end <= str.length() - 1
				&& str.charAt(begin) == str.charAt(end)) {
			longestSubString = str.substring(begin,end+1).length() > longestSubString.length() ? str.substring(begin,end+1) : longestSubString; 
			begin--;
			end++;
		}
	}

}
