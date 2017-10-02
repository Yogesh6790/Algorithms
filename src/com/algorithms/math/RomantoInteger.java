package com.algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

	public static void main(String[] args) {
		String x = "MMMDXLIX";
		Map<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		int total = 0;
		for (int i = 0; i < x.length(); i++) {
			if (i == x.length()-1
					|| map.get("" + x.charAt(i)) >= map.get(""
							+ x.charAt(i + 1))) {
				total += map.get("" + x.charAt(i));
			} else {
				total = total - map.get("" + x.charAt(i))
						+ map.get("" + x.charAt(i + 1));
				i++;
			}
		}
		System.out.println(total);
	}
}
