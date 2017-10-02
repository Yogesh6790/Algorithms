package com.algorithms.string;

public class OneCharacterDifference {

	public static void main(String[] args) {
		String a1 = "pale";
		String a2 = "ple";

		String b1 = "pales";
		String b2 = "pale";

		String c1 = "pale";
		String c2 = "bale";

		String d1 = "pale";
		String d2 = "bake";

		System.out.println(isOneEditAway(a1, a2));
		System.out.println(isOneEditAway(b1, b2));
		System.out.println(isOneEditAway(c1, c2));
		System.out.println(isOneEditAway(d1, d2));
	}

	private static boolean isOneEditAway(String str1, String str2) {
		if (str1.length() == str2.length()) {
			// replace
			int cntr = 0;
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					cntr++;
				}
				if (cntr > 1) {
					return false;
				}
			}
		} else {
			int index1 = 0;
			int index2 = 0;
			if (str1.length() < str2.length()) {
				String str = str1;
				str1 = str2;
				str2 = str;
			}
			while (index1 < str1.length() && index2 < str2.length()) {
				if (str1.charAt(index1) != str2.charAt(index2)) {
					if (index1 != index2) {
						return false;
					}
					index1++;
				} else {
					index1++;
					index2++;
				}
			}
		}
		return true;
	}

}
