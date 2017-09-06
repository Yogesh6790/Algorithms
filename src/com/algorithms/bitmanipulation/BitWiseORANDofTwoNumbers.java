package com.algorithms.bitmanipulation;

public class BitWiseORANDofTwoNumbers {

	public static void main(String[] args) {
		
		int x = 7;
		int y = 3;
		
		String xStr = Integer.toBinaryString(x);
		String yStr = Integer.toBinaryString(y);
		
		xStr = String.format("%0"+Math.max(xStr.length(), yStr.length())+"d", Integer.valueOf(xStr));
		yStr = String.format("%0"+Math.max(xStr.length(), yStr.length())+"d", Integer.valueOf(yStr));
		
		System.out.println("***BITWISE OR****");
		//BITWISE OR
		String res = "";
		boolean carry = false;
		for(int i=xStr.length()-1;i>=0;i--){
			int val1 = Integer.parseInt(""+xStr.charAt(i));
			int val2 = Integer.parseInt(""+yStr.charAt(i));
			int localResult = 0;
			if(val1 == 1 && val2 == 1){
				if(carry){
					localResult = 1;
				}else{
					localResult = 0;
				}
				carry = true;
			}else if(val1 == 1 || val2 == 1){
				if(carry){
					localResult = 0;
					carry = true;
				}else{
					localResult = 1;
					carry = false;
				}
			}else{
				if(carry){
					localResult = 1;
				}else{
					localResult = 0;
				}
				carry = false;
			}
			res = localResult+res;
		}
		if(carry){
			res = 1+res;
		}
		System.out.println(res);
		
		System.out.println();
		System.out.println("***BITWISE AND****");
		//BITWISE AND
		res = "";
		for(int i=xStr.length()-1;i>=0;i--){
			int val1 = Integer.parseInt(""+xStr.charAt(i));
			int val2 = Integer.parseInt(""+yStr.charAt(i));
			int localResult = 0;
			if(val1 * val2 == 1){
					localResult = 1;
			}else{
					localResult = 0;
			}
			res = localResult+res;
		}
		System.out.println(res);
	}

}
