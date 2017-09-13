package com.algorithms.string;
/**
Expected output
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "*") → true
isMatch("aa", "a*") → true
isMatch("ab", "?*") → true
isMatch("aab", "c*a*b") → false
 *
 */
import java.util.Arrays;

public class WildCardMatching {

	public static void main(String[] args) {
		System.out.println(isMatch("aa","a"));
		System.out.println(isMatch("aa","aa"));
		System.out.println(isMatch("aaa","a"));
		System.out.println(isMatch("aa","a*"));
		System.out.println(isMatch("aa",".*"));
		System.out.println(isMatch("ab",".*"));
		System.out.println(isMatch("aab","c*a*b"));
	}
	
	private static boolean isMatch(String string, String pattern) {
		int n = string.length();
		int m = pattern.length();
		
		boolean[][] isMatch = new boolean[n+1][m+1];
		
		isMatch[0][0] = true;
		for(int j=1;j<=m;j++){
			if(pattern.charAt(j-1) == '*'){
				isMatch[0][j] = isMatch[0][j-1];
			}
		}
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(pattern.charAt(j-1) == '*'){
					isMatch[i][j] = isMatch[i-1][j] || isMatch[i][j-1]; 
				}else if(pattern.charAt(j-1) == '.' || pattern.charAt(j-1) == string.charAt(i-1)){
					isMatch[i][j] = isMatch[i-1][j-1]; 
				}else{
					isMatch[i][j] = false;
				}
			}
		}
		return isMatch[n][m];
		
	}

}
