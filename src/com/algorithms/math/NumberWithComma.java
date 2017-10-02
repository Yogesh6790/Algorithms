package com.algorithms.string;

import java.text.DecimalFormat;

public class NumberWithComma {

	public static void main(String[] args) {
		
		String number = "1000500000.574";
		String number2 = "1000500000.5762";
		Double num = Double.parseDouble(number);
		Double num2 = Double.parseDouble(number2);
		
		DecimalFormat format = new DecimalFormat("#,###.00");
		System.out.println(format.format(num));
		System.out.println(format.format(num2));

	}

}
