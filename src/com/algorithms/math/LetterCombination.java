package com.algorithms.string;

import java.util.HashMap;

public class LetterCombination {

	public static void main(String[] args) {
	    HashMap<Integer, String> map = new HashMap<Integer, String>();
	    map.put(2, "abc");
	    map.put(3, "def");
	    map.put(4, "ghi");
	    map.put(5, "jkl");
	    map.put(6, "mno");
	    map.put(7, "pqrs");
	    map.put(8, "tuv");
	    map.put(9, "wxyz");
	    map.put(0, "");
	    
	    String input = "23";
	    printCombination(input,"", map,input.length());
	 
	}

	private static void printCombination(String input, String string,
			HashMap<Integer, String> map, int length) {
		if(string.length() == length){
			System.out.println(string);
			return;
		}		
		
		for(int i=0;i<input.length();i++){
			String str = map.get(Integer.parseInt(""+input.charAt(i)));
			for(int j=0;j<str.length();j++){
				printCombination(input.substring(i+1),string+str.charAt(j),map, length);
			}
		}
		
	}

}
