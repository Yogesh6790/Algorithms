package com.algorithms.string;
/**
 * Expected output
isMatch("aa","a") return false
isMatch("aa","aa") return true
isMatch("aaa","aa") return false
isMatch("aa", "a*") return true
isMatch("aa", ".*") return true
isMatch("ab", ".*") return true
isMatch("aab", "c*a*b") return true
 *
 */
public class RegularExperssionMatching {

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
		if(pattern.length() == 0){
			return string.length() == 0;
		}
		if(pattern.length() == 1){
			if(string.length() == 0){
				return false;
			}
			if(pattern.charAt(0) != string.charAt(0) && pattern.charAt(0) != '.'){
				return false;
			}else{
				return isMatch(string.substring(1), pattern.substring(1));	
			}
		}else{
			if(pattern.charAt(1) != '*'){
				if(string.length() == 0){
					return false;
				}
				if(pattern.charAt(0) != string.charAt(0) && pattern.charAt(0) != '.'){
					return false;
				}else{
					return isMatch(string.substring(1), pattern.substring(1));				
				}
			}else{
				//a char and * doesn't match any of the preceding elements
				if(isMatch(string, pattern.substring(2))){
					return true;
				}
				//a char and * match one or more of the preceding elements
				//trying every substring to see if there is any match
				int i = 0;
				while(i<string.length() && (pattern.charAt(0) == string.charAt(i) || pattern.charAt(0) == '.')){
					if(isMatch(string.substring(i+1), pattern.substring(2))){
						return true;
					}
					i++;
				}
				return false;
			}
		}
		
	}

}
