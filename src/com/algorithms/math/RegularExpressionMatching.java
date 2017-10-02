package com.algorithms.string;
/*
isMatch("aa","a") return false
isMatch("aa","aa") return true
isMatch("aaa","aa") return false
isMatch("aa", "a*") return true
isMatch("aa", ".*") return true
isMatch("ab", ".*") return true
isMatch("aab", "c*a*b") return true
 */
public class RegularExpressionMatching {

	public static void main(String[] args) {
		String x = "7";
		System.out.println(Integer.toBinaryString(7));
		System.out.println(isMatch("aa", "a"));
		System.out.println(isMatch("aa","aa"));
		System.out.println(isMatch("aaa","aa"));
		System.out.println(isMatch("aa", "a*"));
		System.out.println(isMatch("aa", ".*"));
		System.out.println(isMatch("ab", ".*"));
		System.out.println(isMatch("aab", "c*a*b"));
	}

	private static boolean isMatch(String string, String pattern) {
		if (pattern.length() == 0) {
			return (string.length() == 0);
		}
		if (pattern.length() == 1 || pattern.charAt(1) != '*') {
			if (string.length() < 0
					|| (pattern.charAt(0) != string.charAt(0) && pattern
							.charAt(0) != '.')) {
				return false;
			}
			return isMatch(string.substring(1), pattern.substring(1));
		} else {
			if (isMatch(string, pattern.substring(2))) {
				return true;
			}
			int i = 0;
			while (i < string.length()
					&& (pattern.charAt(0) == string.charAt(i) || pattern
							.charAt(0) == '.')) {
				if (isMatch(string.substring(i + 1), pattern.substring(2))) {
					return true;
				}
				i++;
			}
			return false;
		}
		
	}

}
