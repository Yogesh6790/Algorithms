package com.algorithms.string;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String x = "How are you";
		String[] arr = x.split(" ");
		String res = "";
		for(int i=0;i<arr.length;i++){
			res += new StringBuilder(arr[i]).reverse().toString() +" ";
		}
		System.out.println(res.substring(0,res.length()-1));
	}

}
