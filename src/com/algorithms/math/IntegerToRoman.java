package com.algorithms.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {

	public static void main(String[] args) {
		int number = 3549;
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		String finalStr = "";
		for (Map.Entry map1 : map.entrySet()) {
			int val = (int) map1.getKey();
			int cntr = 0;
			if (number >= val) {
				cntr = number / val;
			}
			number %= val;
			for (int i = 0; i < cntr; i++) {
				finalStr += map.get(val);
			}
		}
		System.out.println(finalStr);
	
	}

}
