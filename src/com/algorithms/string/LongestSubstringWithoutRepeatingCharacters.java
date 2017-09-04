package com.algorithms.string;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
// Time complexity : O(n)
public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String args[]) {
		String str = "au"; // bbbbb or pwwkew
		int currentLen = 1;
		int maximumLen = 1;
		int[] prevIndex = new int[256];
		for(int i=0;i<256;i++){
			prevIndex[i] = -1;
		}
		prevIndex[str.charAt(0)] = 0;
		
		for(int i=1;i<str.length();i++){
			if(prevIndex[str.charAt(i)] == -1 || i-currentLen > prevIndex[str.charAt(i)]){
				currentLen++;
			}else{
				maximumLen = Math.max(maximumLen, currentLen);
				currentLen = i-prevIndex[str.charAt(i)];
			}
			prevIndex[str.charAt(i)] = i;
		}
		maximumLen = Math.max(maximumLen, currentLen);
		System.out.println(maximumLen);
		
	} 

}
